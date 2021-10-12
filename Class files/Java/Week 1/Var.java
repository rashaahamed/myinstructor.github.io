// Local variable type inference

// Java is a strongly typed language
/*
 * Starting in Java 10, you have the option of using the keyword 'var' instead
 * of the type for local variables. The complier determine the type for you
 */

public class Var {
  String firstName; // Instance variables have values by default
  int id;

  public static void main(String[] main) {
    var name = "Mary"; // Local variables
    var num = 15;

    System.out.println(name);
    System.out.println(num);
  }
}
