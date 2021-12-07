// Comparing arrays

public class Comparison {
  public static void main(String[] main) {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b = new int[] { 1, 2, 3, 4, 5 };
    int[] c = a;

    System.out.println(a == b); // false - two different objects
    System.out.println(a == c); // true - both point to the same object
    System.out.println(b == c); // false

    // The Arrays class doesn't implement the equals() method
    // In both case we are checking the reference, not the content
    // Here we have the default behaviour of the equals() method
    System.out.println(a.equals(b)); // false
    System.out.println(a.equals(c)); // true
    System.out.println(b.equals(c)); // false
  }
}
