// CShifting elements in an array

import java.util.*;

public class Arrays_12 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[a.length];

    // source, startPos, dest, startPos, numOfItems
    System.arraycopy(a, 0, b, 1, a.length - 1);

    System.out.println("Array a: " + Arrays.toString(a));
    System.out.println("Array b: " + Arrays.toString(b));
  }
}
