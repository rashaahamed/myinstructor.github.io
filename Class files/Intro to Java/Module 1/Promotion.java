// Numeric promotion

/*
 *  If one of an operator's operands is an int, and the ther operand is an
 *  double, Java will automatically convert the value of the int to a double
 */

public class Promotion {
  public static void main(String[] args) {
    int a = 5;
    int b = 5;
    double c = 5.0;
    int d = 0;
    double e = 0;

    d = a + b; // 'd' is an integer
    System.out.println(d);

    e = a + c; // returns a double
    // Error: incompatible types: possible lossy conversion from double to int
    System.out.println(e);

    // = assignment operator
    // == comparison operator
    System.out.println(a == c);
  }
}
