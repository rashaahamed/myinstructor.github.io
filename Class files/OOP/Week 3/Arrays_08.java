// The Array class and its methods

import java.util.*;

public class Arrays_07 {
  public static void main(String[] args) {
    // 'a' and 'b' are references
    int[] a = {1, 2, 3, 4, 5, 6};
    int[] b = a;
    int[] c = {1, 2, 3, 4, 5, 6};

    System.out.println(a.length + " | " + b.length);
    System.out.println(a == b);

    // The equals() methods compare the references, not the content
    // This is the default behaviour of the equals method
    // The Arrays class doesn't have its own version of the equals method
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}
