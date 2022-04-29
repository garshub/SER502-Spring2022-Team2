package runtimeUtility;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class RuntimeMain {

    public void execute(String filePath) {
        try {
            // Extracts the intermediate code from .vlxl file
            CharStream intermediateCode = CharStreams.fromFileName(filePath);
            // Creates a new file with .op as an extension
            PrintWriter pw = new PrintWriter(filePath.replace("vlxl", "op"), StandardCharsets.UTF_8);

            // Pass intermediate code to runtime module
            Runtime runtime = new Runtime(intermediateCode.toString().replaceAll("\r", ""));
            runtime.execute();
            // Print the result stored in getOutputData func
            System.out.println("Output:\n" + runtime.getOutputData());
            // Append the result to .op file which we've created
            pw.println("Output \n");
            pw.println(runtime.getOutputData());
            pw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
