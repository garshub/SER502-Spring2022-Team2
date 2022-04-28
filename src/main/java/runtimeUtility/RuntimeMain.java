package runtimeUtility;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class RuntimeMain {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            // Takes the inputPath from the argument
            String filePath = args[0];
            // Extracts the intermediate code from .vlxl file
            CharStream intermediateCode = CharStreams.fromFileName(filePath);
            // Creates a new file with .op as an extension
            PrintWriter pw = new PrintWriter(filePath.replace("vlxl", "op"), StandardCharsets.UTF_8);
            try {
                // Pass intermediate code to runtime module
                Runtime runtime = new Runtime(intermediateCode.toString().replaceAll("\r", ""));
                runtime.execute();
                // Print the result stored in getOutputData func
                System.out.println("Output:\n" + runtime.getOutputData());
                // Append the result to .op file which we've created
                pw.println("Output \n");
                pw.println(runtime.getOutputData());
            } catch (Exception e) {
                e.printStackTrace();
            }
            pw.close();
        }
    }
}
