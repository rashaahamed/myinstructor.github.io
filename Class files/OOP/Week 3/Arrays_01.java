// The Array class

/*
 * Arrays are homogeneous data structures that are implemented as objects.
 * They are mutable, have fixed size and can be multidimensional
 */

import java.util.*;

public class Arrays_01 {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5, 6};
    int[] a2 = new int[5];

    String[] a3 = {"John", "Henry", "Steve"};
    String[] a4 = new String[3];

    System.out.println(a1);

    System.out.println(Arrays.toString(a1));
  }
}
