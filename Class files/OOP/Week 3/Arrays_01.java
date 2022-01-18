// Arrays

/*
  Arrays are homogeneous data structures that are implemented as objects.
  They are mutable, have fixed size anc can be multidimensional
*/

import java.util.*;

public class Arrays_01 {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5};
    int[] a2 = new int[5];

    String[] a3 = {"Mary", "Anthony", "Jacques"};
    String[] a4 = new String[3];

    System.out.println(a1);
    // This is a static method
    System.out.println(Arrays.toString(a1));
  }
}
