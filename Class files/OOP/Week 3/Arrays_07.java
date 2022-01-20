// Arrays_06

import java.util.*;

public class Arrays_07 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[a.length];

    // source, startPos, dest, startPos, numOfItems (length)
    System.arraycopy(a, 0, b, 0, 5);

    a[0] = 9999;

    System.out.println("Array a: " + Arrays.toString(a));
    System.out.println("Array b: " + Arrays.toString(b));
  }
}
