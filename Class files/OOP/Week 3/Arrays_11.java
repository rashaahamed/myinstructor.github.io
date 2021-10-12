// Copying an array - arraycopy method

import java.util.*;

public class Arrays_11 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    int[] b = new int[a.length];
    System.arraycopy(a, 0, b, 0, 5);

    a[0] = 999;

    System.out.println("Array a: " + Arrays.toString(a));
    System.out.println("Array b: " + Arrays.toString(b));
  }
}
