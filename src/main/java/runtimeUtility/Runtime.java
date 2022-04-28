package runtimeUtility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import static runtimeUtility.Constants.*;

public class Runtime {
    private Stack<HashMap<String, DataType>> memoryStack = new Stack<>();
    private List<String> intermediateCode;
    private int programCounter = 0;
    private String output = "";

    public Runtime(String intermediateCode) {
        this.intermediateCode = Arrays.asList(intermediateCode.split("\\n"));
    }

    public void execute() throws Exception {
        initializeStackMemory();

        while (programCounter < intermediateCode.size()) {
            programCounter = executeInstructionHandler(intermediateCode.get(programCounter), programCounter) + 1;
        }

    }

    private void initializeStackMemory() {
        memoryStack.push(new HashMap<>());
    }

    private int executeInstructionHandler(String currentInstruction, int programCounter) throws Exception {

        String[] instructions = currentInstruction.split("\\s");
        String instructionType = instructions[0];

        switch (instructionType) {
            case STORE_INSTRUCTION -> executeStoreInstruction(instructions); break;
            case WRITE_INSTRUCTION -> executePrintInstruction(instructions); break;
            case ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION -> executeArithmeticOperations(instructions); break;
            case GT, GTE, LT, LTE, EQUAL_EQUAL, NOT_EQUAL  -> executeBooleanComparisonOperations(instructions); break;

            case IF_START:
                programCounter = executeIf(++programCounter);
                break;
            case ELSE_IF_START:
                programCounter = executeElseIf(++programCounter);
                break;
            case ELSE_START:
                programCounter = executeElse(++programCounter);
                break;

            case WHILE_START:
                programCounter = executeWhile(++programCounter);
                break;

            case UNARY_MINUS:
                executeUnaryMinusInstruction(instructions);
                break;

            case OR, AND -> executeBooleanInstruction(instructions); break;

            default -> throw new IllegalStateException("Unexpected value: " + instructionType);
        }

        return programCounter;
    }



    private void executeArithmeticOperations(String[] instruction) throws Exception {

        DataType left = getWildCardValue(instruction[2]);
        DataType right = getWildCardValue(instruction[3]);
        String leftDatatype = left.getDataType();
        String rightDatatype = right.getDataType();

        if (leftDatatype != rightDatatype) {
            throw new Exception("Data mismatch");
        } else if (leftDatatype == rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
            throw new Exception("Arithmetic exception Can't be performed on boolean type");
        } else {
            int leftOperand = left.dataAsInteger();
            int rightOperand = right.dataAsInteger();

            switch (instruction[0]) {
                case ADDITION -> setValue(instruction[1], new DataType(leftOperand + rightOperand));
                case SUBTRACTION -> setValue(instruction[1], new DataType(leftOperand - rightOperand));
                case MULTIPLICATION -> setValue(instruction[1], new DataType(leftOperand * rightOperand));
                case DIVISION -> setValue(instruction[1], new DataType(leftOperand / rightOperand));
            }
        }
    }

    private void executeBooleanComparisonOperations(String[] instruction) throws Exception {



        DataValues left = getWildCardValue(instruction[2]);
        DataValues right = getWildCardValue(instruction[3]);
        String leftDatatype = left.getDataType();
        String rightDatatype = right.getDataType();

        if(leftDatatype!=rightDatatype) {
            throw new Exception("Data mismatch");
        }else if(leftDatatype==rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
            boolean leftOperand = getValue(instruction[2]).asBoolean();
            boolean rightOperand = getValue(instruction[3]).asBoolean();
            switch(instruction[0]) {
                case EQUAL_EQUAL:
                    setValue(instruction[1], new DataValues(leftOperand == rightOperand));
                    break;
                case NOT_EQUAL:
                    setValue(instruction[1], new DataValues(leftOperand != rightOperand));
                    break;
                default:
                    throw new Exception("Arithmetic exception Can't be performed on boolean type");
            }

        }
        else {
            int leftOperand = getValue(instruction[2]).asInt();
            int rightOperand = getValue(instruction[3]).asInt();

            switch(instruction[0]) {
                case GT:
                    setValue(instruction[1], new DataValues(leftOperand > rightOperand));
                    break;
                case GTE:
                    setValue(instruction[1], new DataValues(leftOperand >= rightOperand));
                    break;
                case LT:
                    setValue(instruction[1], new DataValues(leftOperand < rightOperand));
                    break;
                case LTE:
                    setValue(instruction[1], new DataValues(leftOperand <= rightOperand));
                    break;
                case EQUAL_EQUAL:
                    setValue(instruction[1], new DataValues(leftOperand == rightOperand));
                    break;
                case NOT_EQUAL:
                    setValue(instruction[1], new DataValues(leftOperand != rightOperand));
                    break;
            }


        }
    }

    private void executeStoreInstruction(String[] instruction) {
        if (instruction[1].equals(ACCUMULATOR_REGISTER)) {
            setValue(ACCUMULATOR_REGISTER, getWildCardValue(instruction[2]));
        } else {
            setValue(instruction[1], getValue(instruction[2]));
        }
    }

    private void executePrintInstruction(String[] instruction) {
        DataType printData = getWildCardValue(instruction[1]);

        if (printData != null) {
            try {
                generateOutput(printData.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void generateOutput(String output) {
        this.output += output + "\n";
    }

    public String getOutputData() {
        return this.output;
    }

    private DataType getWildCardValue(String value) {
        if (value.equals("NULL")) {
            return null;
        } else if (isInt(value)) {
            return new DataType(Integer.parseInt(value));
        } else if (isBoolean(value)) {
            return new DataType(Boolean.parseBoolean(value));
        } else if (isString(value)) {
            return new DataType(cleanString(value));
        } else {
            return getValue(value);
        }
    }

    private String cleanString(String value){
        int length = value.length();
        return value.substring(1, length - 1);
    }

    private boolean isInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isBoolean(String value) {
        try {
            boolean b = Boolean.parseBoolean(value);
            return b || value.equalsIgnoreCase("FALSE");
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isString(String value) {
        return value.startsWith(":") && value.endsWith(":");
    }


    private DataType getValue(String identifier) {
        HashMap<String, DataType> hashMap = memoryStack.peek();
        return hashMap.get(identifier);
    }

    private void setValue(String identifier, DataType value) {
        HashMap<String, DataType> hashMap = memoryStack.peek();
        hashMap.put(identifier, value);
    }

    private int executionBlock(int programCounter, String stopCond,boolean skipLastConditionCheck) throws Exception {
        while(programCounter >= 0) {
            String instruction = intermediateCode.get(programCounter);

            if (instruction.equals(stopCond)) {
                break;
            }
            else {
                if(!skipLastConditionCheck) {
                    programCounter = executeInstructionHandler(instruction, programCounter);
                }
                programCounter = programCounter +1;
            }
        }
        return programCounter;
    }

    private int executeIf(int programCounter) throws Exception {

        programCounter = executionBlock(programCounter, CONDITION_END,false);
        if(getValue(ACCUMULATOR_REGISTER).asBoolean()){
            programCounter = executionBlock(programCounter, IF_END,false);
            programCounter = executionBlock(programCounter, IF_ELSE_END,true);
        } else {
            programCounter = executionBlock(programCounter, IF_END,true);
        }
        return programCounter;
    }

    private int executeElse(int programCounter) throws Exception {
        programCounter = executionBlock(programCounter, ELSE_END,false);
        return programCounter;
    }

    private int executeElseIf(int programCounter) throws Exception {
        programCounter = executionBlock(programCounter, CONDITION_END,false);
        if(getValue(ACCUMULATOR_REGISTER).asBoolean()){
            programCounter = executionBlock(programCounter, ELSE_IF_END,false);
            programCounter = executionBlock(programCounter, IF_ELSE_END,true);
        } else {
            programCounter = executionBlock(programCounter, ELSE_IF_END,true);
        }
        return programCounter;
    }

    private int executeWhile(int whileStartCounter) throws Exception {
        int counter;

        while(true) {
            counter = executionBlock(whileStartCounter, CONDITION_END,false);

            boolean b= getValue(ACCUMULATOR_REGISTER).asBoolean();

            if(b) {

                counter = executionBlock(counter, WHILE_END,false);

            }
            else {

                counter = executionBlock(counter, WHILE_END,true);
                break;
            }
        }
        return counter;
    }

    private void executeUnaryMinusInstruction(String[] instruction) throws Exception{
        DataValues operand = getWildCardValue(instruction[1]);
        String operandDatatype = operand.getDataType();
        if(operandDatatype.equalsIgnoreCase("INTEGER")) {
            setValue(instruction[1], new DataValues(operand.asInt()*-1));
        }else {
            throw new Exception("Can not perform unary operation on binary");
        }

    }

    private void executeBooleanInstruction(String[] instruction) throws Exception {

        DataValues left = getWildCardValue(instruction[2]);
        DataValues right = getWildCardValue(instruction[3]);
        String leftDatatype = left.getDataType();
        String rightDatatype = right.getDataType();
        if(leftDatatype!=rightDatatype) {
            throw new Exception("Data mismatch");
        }else if(leftDatatype==rightDatatype && !leftDatatype.equalsIgnoreCase("INTEGER")) {
            boolean leftB = left.asBoolean();
            boolean rightB = right.asBoolean();

            switch(instruction[0]) {

                case AND:
                    setValue(instruction[1], new DataValues(leftB && rightB));
                    break;
                case OR:
                    setValue(instruction[1], new DataValues(leftB || rightB));
                    break;

            }
        }

    }




}
