package runtimeUtility;

import java.util.*;

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
            case STORE_INSTRUCTION -> executeStoreInstruction(instructions);
            case WRITE_INSTRUCTION -> executePrintInstruction(instructions);
            case ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION -> executeArithmeticOperations(instructions);
            case GT, GTE, LT, LTE, EQUAL_TO, NOT_EQUAL_TO -> executeBooleanComparisonOperations(instructions);
            case IF_START -> programCounter = executeIf(++programCounter);
            case ELSE_IF_START -> programCounter = executeElseIf(++programCounter);
            case ELSE_START -> programCounter = executeElse(++programCounter);
            case WHILE_START -> programCounter = executeWhile(++programCounter);
            case FOR_START -> programCounter = executeFor(++programCounter);
            case UNARY_MINUS -> executeUnaryMinusInstruction(instructions);
            case OR, AND -> executeBooleanInstruction(instructions);
        }
        return programCounter;
    }

    private void executeArithmeticOperations(String[] instruction) throws Exception {

        DataType left = getDataValue(instruction[2]);
        DataType right = getDataValue(instruction[3]);
        String leftDatatype = left != null ? left.getDataType() : null;
        String rightDatatype = right != null ? right.getDataType() : null;

        if (!leftDatatype.equals(rightDatatype)) {
            throw new Exception("Data mismatch");
        } else if (!leftDatatype.equalsIgnoreCase("integer")) {
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

        DataType left = getDataValue(instruction[2]);
        DataType right = getDataValue(instruction[3]);
        String leftDatatype = left != null ? left.getDataType() : null;
        String rightDatatype = right != null ? right.getDataType() : null;

        if (!leftDatatype.equals(rightDatatype)) {
            throw new Exception("Data mismatch");
        } else if (!leftDatatype.equalsIgnoreCase("integer")) {
            boolean leftOperand = getValue(instruction[2]).dataAsBoolean();
            boolean rightOperand = getValue(instruction[3]).dataAsBoolean();
            switch (instruction[0]) {
                case EQUAL_TO -> setValue(instruction[1], new DataType(leftOperand == rightOperand));
                case NOT_EQUAL_TO -> setValue(instruction[1], new DataType(leftOperand != rightOperand));
                default -> throw new Exception("Expression Type Error!");
            }
        } else {
            int leftOperand = getValue(instruction[2]).dataAsInteger();
            int rightOperand = getValue(instruction[3]).dataAsInteger();

            switch (instruction[0]) {
                case GT -> setValue(instruction[1], new DataType(leftOperand > rightOperand));
                case GTE -> setValue(instruction[1], new DataType(leftOperand >= rightOperand));
                case LT -> setValue(instruction[1], new DataType(leftOperand < rightOperand));
                case LTE -> setValue(instruction[1], new DataType(leftOperand <= rightOperand));
                case EQUAL_TO -> setValue(instruction[1], new DataType(leftOperand == rightOperand));
                case NOT_EQUAL_TO -> setValue(instruction[1], new DataType(leftOperand != rightOperand));
            }
        }
    }

    private int executionBlock(int programCounter, String stopCondition, boolean skipLastConditionCheck) throws Exception {

        while (programCounter >= 0) {
            String instruction = intermediateCode.get(programCounter);
            if (!instruction.equals(stopCondition)) {
                if (!skipLastConditionCheck) {
                    programCounter = executeInstructionHandler(instruction, programCounter);
                }
                programCounter = programCounter + 1;
            } else {
                break;
            }
        }
        return programCounter;
    }

    private int executeIf(int programCounter) throws Exception {

        programCounter = executionBlock(programCounter, CONDITION_END, false);
        if (getValue(ACCUMULATOR_REGISTER).dataAsBoolean()) {
            programCounter = executionBlock(programCounter, IF_END, false);
            programCounter = executionBlock(programCounter, IF_ELSE_END, true);
        } else {
            programCounter = executionBlock(programCounter, IF_END, true);
        }
        return programCounter;
    }


    private int executeElse(int programCounter) throws Exception {
        programCounter = executionBlock(programCounter, ELSE_END, false);
        return programCounter;
    }


    private int executeElseIf(int programCounter) throws Exception {
        programCounter = executionBlock(programCounter, CONDITION_END, false);
        if (getValue(ACCUMULATOR_REGISTER).dataAsBoolean()) {
            programCounter = executionBlock(programCounter, ELSE_IF_END, false);
            programCounter = executionBlock(programCounter, IF_ELSE_END, true);
        } else {
            programCounter = executionBlock(programCounter, ELSE_IF_END, true);
        }
        return programCounter;
    }

    private void executeStoreInstruction(String[] instruction) {
        if (instruction[1].equals(ACCUMULATOR_REGISTER)) {
            setValue(ACCUMULATOR_REGISTER, getDataValue(instruction[2]));
        } else {
            setValue(instruction[1], getValue(instruction[2]));
        }
    }

    private void executePrintInstruction(String[] instruction) {
        DataType printData = getDataValue(instruction[1]);

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

    private DataType getDataValue(String value) {
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

    private String cleanString(String value) {
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

    private int executeWhile(int whileStartCounter) throws Exception {
        int counter;
        do {
            counter = executionBlock(whileStartCounter, CONDITION_END, false);
            if (getValue(ACCUMULATOR_REGISTER).dataAsBoolean()) {
                counter = executionBlock(counter, WHILE_END, false);
            } else {
                counter = executionBlock(counter, WHILE_END, true);
                break;
            }
        } while (true);

        return counter;
    }

    private int executeFor(int forStartCounter) throws Exception {
        int counter;
        do {
            counter = executionBlock(forStartCounter, CONDITION_END, false);
            if (getValue(ACCUMULATOR_REGISTER).dataAsBoolean()) {
                counter = executionBlock(counter, FOR_END, false);
            } else {
                counter = executionBlock(counter, FOR_END, true);
                break;
            }
        } while (true);

        return counter;
    }

    private void executeUnaryMinusInstruction(String[] instruction) throws Exception {
        DataType operand = getDataValue(instruction[1]);
        String operandDatatype = operand.getDataType();
        if (operandDatatype.equalsIgnoreCase("INTEGER")) {
            setValue(instruction[1], new DataType(-1 * operand.dataAsInteger()));
        } else {
            throw new Exception("Incompatible datatype");
        }
    }

    private void executeBooleanInstruction(String[] instruction) throws Exception {

        DataType left = getDataValue(instruction[2]);
        DataType right = getDataValue(instruction[3]);
        String leftDatatype = left.getDataType();
        String rightDatatype = right.getDataType();

        if (leftDatatype != rightDatatype) {
            throw new Exception("Data mismatch");
        } else if (leftDatatype == rightDatatype && !leftDatatype.equalsIgnoreCase("integer")) {
            boolean leftB = left.dataAsBoolean();
            boolean rightB = right.dataAsBoolean();

            switch (instruction[0]) {
                case AND -> setValue(instruction[1], new DataType(leftB && rightB));
                case OR -> setValue(instruction[1], new DataType(leftB || rightB));
            }
        }
    }
}
