// Arrays

import java.util.*;

public class Arrays_06 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = a; // we are not copying, but addind a new reference to the array object

    b[0] = 6789;

    int[] copy = a.clone();

    a[0] = 1000;

    System.out.println("Array a: " + Arrays.toString(a));
    System.out.println("Array b: " + Arrays.toString(b));
    System.out.println("Array c: " + Arrays.toString(copy));
  }
}
