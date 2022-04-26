package compiler;

public class IntermediateCode {

    public String intermediateCode = "";

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
