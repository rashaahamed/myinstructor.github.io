// Creating variables

public class Variables {
  public static void main(String[] main) {
    int a = 12;  // variable
    String name = "John";
    String lastName, address;
    String firstName = lastName = address = "Not empty";
    // Variable declaration
    int b, c, d;
    // Assignment statement
    b = c = d = 5;

    /*
     * The 'final' keyword can be used in a variable declaration to make the
     * variable a named constant. Named constants are initialized with a value,
     * and that value cannot change during the execution of the program
     */

    final int ID = 7;
    final String FIRST_NAME = "John Smith";

    System.out.println(firstName);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println("Welcome " + name); // literals
  }
}
