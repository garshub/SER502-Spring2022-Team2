package compiler;

import gen.LexinalBaseVisitor;

public class LexinalCompiler extends LexinalBaseVisitor<Object> {
    private IntermediateCode intermediateCodeGen = new IntermediateCode();

    public String getOutput(){
        return intermediateCodeGen.intermediateCode;
    }
}
