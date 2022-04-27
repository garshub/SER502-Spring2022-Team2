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
            case STORE_INSTRUCTION -> executeStoreInstruction(instructions);
            case WRITE_INSTRUCTION -> executePrintInstruction(instructions);
            case ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION -> executeArithmeticOperations(instructions);
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


}
