package compiler;

import gen.LexinalLexer;
import gen.LexinalParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;


public class CompilerMain {

    public void execute(String filePath) {
        try {
            // Extracts the lexinal code from .lxl file
            CharStream lexinalCode = CharStreams.fromFileName(filePath);

            // Generates parser tree from lexinal code
            LexinalLexer lexer = new LexinalLexer(lexinalCode);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LexinalParser parser = new LexinalParser(tokens);
            ParseTree pTree = parser.program();

            // Generates intermediate code
            LexinalCompiler compiler = new LexinalCompiler();
            compiler.visit(pTree);
            List<String> intermediateCode = Arrays.asList(compiler.getOutput().split("\\n"));
            System.out.println("Compile time: No of lines in intermediate code - " + intermediateCode.size());
            if (intermediateCode.size() >= 1) {
                // Append the intermediate code to .vlxl file
                PrintWriter pw = new PrintWriter(filePath.replace("lxl", "vlxl"), StandardCharsets.UTF_8);
                for (String s : intermediateCode) {
                    pw.println(s);
                }
                pw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
