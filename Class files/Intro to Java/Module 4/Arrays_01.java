// The Arrays class

/*
 * Arrays are homogeneous data structures that can are implemented as objects.
 * They are mutable, have fixed size and can be multidimentsional
 */

import java.util.*;

public class Arrays_01 {
  public static void main(String[] args) {
    //         0  1  2  3  4
    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[5];

    String[] c = {"John", "Jack", "Mary"};

    System.out.println(a);
    System.out.println(Arrays.toString(a));
  }
}
