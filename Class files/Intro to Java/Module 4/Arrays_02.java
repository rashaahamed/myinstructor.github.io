// The Arrays class

import java.util.*;

public class Arrays_02 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();

    // Enhanced for (aka for-each, for each)
    for (int elem : a)
      System.out.print(elem + " ");
    System.out.println();
  }
}
