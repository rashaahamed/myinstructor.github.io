// Our first Java program, the good old Hello world
// This is a comment in Java

// CamelCase
// The main() method is responsible for running our application

// Source code (a .java file)
// Compiler (javac) -> bytecode (a .class file)
// Execute the bytecode (java)

/* 1. Create a .java file (your code) in text editor
 * 2. Use the template (class + main() method)
 * 3. Open your folder in Terminal/Power shell
 * 4. Compile your code (javac MyClass.java) - compiler
 * 5. Execute your code (java MyClass) - interpreter
 *
 * Or Java MyClass.java (this will not create a .class file)
 */

public class HelloWorld {
  public static void main(String[] args) {
    int number1 = 45;
    // number is a variable
    int number2 = 15;

    System.out.println(number1 + number2);
  }
}
