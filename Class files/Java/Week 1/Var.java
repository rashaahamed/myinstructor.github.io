// Local variable type inference

// Java is a strongly typed language
/*
 * Starting in Java 10, you have the option of using the keyword 'var' instead
 * of the type for local variables. The compiler determine the type for you
 */

public class Var {
  // Instance variables (they have values by default)
  // Class members, they aka fields
  String name; // null
  int id;      // 0

  public static void main(String[] main) {
    // Local variables
    var name = "Mary";
    var num = 15;
    var rate = 2.75;
    System.out.println(name);
    System.out.println(num);
    System.out.println(rate);
  }
}
