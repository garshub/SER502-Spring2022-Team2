package controller;

import compiler.CompilerMain;
import runtimeUtility.RuntimeMain;

public class CompilerController {

    public static void main(String[] args) {

        try{
            if(args.length > 0){
                String filePath = args[0];
                CompilerMain compiler = new CompilerMain();
                compiler.execute(filePath);

                filePath = filePath.substring(0, filePath.length()-4) + ".vlxl";

                System.out.println("Compilation Successfull!");
                System.out.println("Intermediate Code saved at " + filePath + "\n");

                RuntimeMain runtime = new RuntimeMain();
                runtime.execute(filePath);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
