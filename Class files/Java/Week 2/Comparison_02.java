// Comparing arrays

public class Comparison {
  public static void main(String[] main) {
    int[] a = { 1, 2, 3, 4, 5};
    int[] b = new int[] { 1, 2, 3, 4, 5};
    int[] c = a;

    System.out.println(a == b); // false - two different objects
    System.out.println(a == c); // true - both point to the same object
    System.out.println(b == c); // false

    // Arrays doesn't implement the equals method
    // In both cases we are checking the reference, not the content
    System.out.println(a.equals(b)); // false, 'b' is an argument to a method
    System.out.println(a.equals(c)); // true
  }
}
