package compiler;

import gen.LexinalLexer;
import gen.LexinalParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;



public class CompilerMain {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                String path = args[0];

                CharStream code = CharStreams.fromFileName(path);
                LexinalLexer lexer = new LexinalLexer(code);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                LexinalParser parser = new LexinalParser(tokens);
                ParseTree tree = parser.program();

                LexinalCompiler d = new LexinalCompiler();
                d.visit(tree);
                List<String> intermediateCode = Arrays.asList(d.getOutput().split("\\n"));
                if (intermediateCode.size() > 1) {
                    PrintWriter writer = new PrintWriter(path.replace("lxl", "vlxl"), String.valueOf(UTF_8));
                    for (String s : intermediateCode) {
                        writer.println(s);
                    }
                    writer.close();
                }

            }
        } catch (Exception e) {
            System.out.println("Wrong Input file");
        }
    }

    }
