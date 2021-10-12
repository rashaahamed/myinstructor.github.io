// Copying an array - clone method

import java.util.*;

public class Arrays_10 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = a.clone();
    int[] c = b;

    b[0] = 999;

    System.out.println("Array a: " + Arrays.toString(a));
    System.out.println("Array b: " + Arrays.toString(b));
    System.out.println("Array c: " + Arrays.toString(c));
  }
}
