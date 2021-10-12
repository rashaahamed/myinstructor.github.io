// Comparison

/*
 *  For object comparison, the equality operator is applied to the references
 *  to the objects, not to the objects they point to
 *  We use the equals method to check if the content of two strings is equal
 */

public class Comparison {
  public static void main(String[] args) {
    String a = "Jack"; // pool of strings
    String b = "Jack";
    System.out.println(a == b);

    String x = new String("John");
    String y = new String("John");
    System.out.println(x == y);

    System.out.println(x.equals(y));
  }
}
