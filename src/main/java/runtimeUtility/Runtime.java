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
        //System.out.println("intermediate code"+ this.intermediateCode) ;
    }

    public void execute() {
        initializeStackMemory();

        while(programCounter < intermediateCode.size()) {

            programCounter = executeInstructionHandler(intermediateCode.get(programCounter), programCounter) + 1;

        }

    }

    private void initializeStackMemory() {
        memoryStack.push(new HashMap<>());
    }

    private int executeInstructionHandler(String currentInstruction, int programCounter) {

        String[] instructions = currentInstruction.split("\\s");
        String instructionType = instructions[0];

        switch (instructionType) {
            case STORE_INSTRUCTION -> executeStoreInstruction(instructions);
            case WRITE_INSTRUCTION -> executePrintInstruction(instructions);
        }

        return programCounter;
    }

    private void executeStoreInstruction(String[] instruction) {
        if(instruction[1].equals(ACCUMULATOR_REGISTER)) {
            setValue(ACCUMULATOR_REGISTER, getWildCardValue(instruction[2]));
        }
        else {
            setValue(instruction[1], getValue(instruction[2]));
        }
    }

    private void executePrintInstruction(String[] instruction) {
        DataType printData = getWildCardValue(instruction[1]);

        if (null != printData) {
            try {
                generateOutput(printData.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void generateOutput (String output) {
        this.output += output + "\n";
    }

    public String getOutputData() {
        return this.output;
    }

    private DataType getWildCardValue(String value) {
        if(value.equals("NULL")) {
            return null;
        }
        else if(isInt(value)) {
            return new DataType(Integer.parseInt(value));
        }
        else if(isBoolean(value)) {
            return new DataType(Boolean.parseBoolean(value));
        }
        else {
            return getValue(value);
        }
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


    private DataType getValue(String identifier) {
        HashMap<String, DataType> hashMap = memoryStack.peek();
        return hashMap.get(identifier);
    }

    private void setValue(String identifier, DataType value) {
        HashMap<String, DataType> hashMap = memoryStack.peek();
        hashMap.put(identifier, value);
        //System.out.println(memoryStack);
    }



}
