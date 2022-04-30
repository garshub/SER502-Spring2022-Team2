# SER502-Spring2022-Team2
Welcome to SER 502 Group project by Team 2! :smile:

We have implemented an imperitive programming language "Lexinal". Its grammar is designed using Antlr and the compiler is written in Java. 

## Features
  - Datatypes supported: int, boolean, string
  - Arithmetic operators: +, -, *, /
  - Boolean operators: and, or, not, >, >=, <, <=, ==
  - Ternary Operator
  - If-else, If-elseIf
  - Loops: while, for, enhanced for
  - Nested loops and if-else ladder supported
  - Unary support for numbers and identifiers
  - Printing using print(<message>), print(<value>) and print(<message>, <value>)
  - Single line and Multi line comments
  - All variables have a universal scope

To run this language, you need to locate `Lexinal.jar` (SER502-Spring2022-Team2/out/artifacts/Lexinal_jar/) and use the command line instructions mentioned below.

## Tools used
    - Intellij IDEA 2021.2.1
    - Antlr v4
    - Git

## System which are used 
    - Windows 

## Instructions to use Lexinal

  Follow the below steps to install this git project:
    
    1. Clone this project in your IDE or Download and Unzip the project in a new folder.
    2. Open the project in IntelliJ using following steps:
        File >> Open
        Browse to the downloaded project and open pom.xml

## Running the project

  As this is a maven project, setup maven and wait for all dependencies to get get resolved.
  
    1. Locate Maven and clean and install the project.
    2. CompilerMain is the main class that runs the compiler and generates intermediate code.
    3. RuntimeMain is the main class that runs the interpreter and generates the fianl output of the code.
    4. CompilerController is the goto class that runs both CompilerMain and RuntimeMain and will be used for our purposes.
        
## How to build jars using IntelliJ

   We have already created a jar for you :smirk_cat: which can be used for running our code. If you are unable to use it and need to create a new one, follow these steps.   
   
    1. Open File >> Project Structure (Ctrl+Alt+Shift+S)
    2. Select Artifacts and click on + (Alt+Insert)
    3. Select JAR >> From module with dependencies
    4. Locate the Main Class controller.CompilerController
    5. Keep everything as is and click OK.
    6. Click OK and close this window.
    7. Select Build >> Build Artifacts
    8. Lexinal.jar should be created under out/artifacts/Lexinal_jar
  

## Steps to run a Lexinal Program

    1. Run via IntelliJ
      a. Maven Clean and Install the Project once.
      b. Open CompilerController and right-click to open Modify Run Configuration
      c. Keep everything as-is, but under Program Arguments, give the path for your lexinal file (.lxl) and click OK
      d. You should be able to run your .lxl file now and should see output on the console
      e. Side note, intermediate code (.vlxl) and output file (.op), will be created where your (.lxl) file is.
    
    2. Run via JAR:
  
      a. In the terminal, navigate to the directory where the Levinal.jar is present.
      b. Write your lexinal code and save it with .lxl extension (Ex - input.lxl) 
      c. Open a cmd prompt or a terminal where your Lexinal.jar is. (Can be done in IntelliJ Terminal).
      d. Side note, the input.lxl file can be anywhere, just give it absolute path in the cmd prompt.
  
 
## Terminal Command to execute a Lexinal File:

        java -jar Lexinal.jar input.lxl
     
 
## Link to Youtube Video


    
