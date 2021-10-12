// Hello Java

/*
 *  A class is a blueprint that defines the variables and the methods commom
 *  to all objects of a certain kind
 *
 *  JVM (Java Virtual Machine) -> compiler
 *  Compiler: javac MyClass.java -> MyClass.class (bytecode)
 *  Interpreter: java MyClass
 *
 *  When you have just one class in a file, you can use this:
 *  java MyClass.java
 *
 *  "Write once, run everywhere" (97.8% true)
 *
 *  Bytecode is a machine-independent code generated by the Java compiler and
 *  executed by the Java interpreter
 */

public class HelloJava {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }
}
