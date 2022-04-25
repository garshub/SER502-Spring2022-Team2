package compiler;

public class IntermediateCode {

    private String intermediateCode = "";

    public void addIntermediateOutput(String code) {
        this.intermediateCode += code + "\n";
    }

    public String getIntermediateCode() {
        return intermediateCode;
    }

    public void setIntermediateCode(String intermediateCode) {
        this.intermediateCode = intermediateCode;
    }
}
