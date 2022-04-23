package compiler;

public class IntermediateCode {

    private String intermediateCode = "";

    public void addIntermediateOutput(String code) {
        this.intermediateCode += code + "\n";
    }
}
