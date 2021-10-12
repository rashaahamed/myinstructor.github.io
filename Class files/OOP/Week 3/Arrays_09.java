// Binary search

/*
 * When a value is not found, the program determines its probable position,
 * negates it and subtracts 1
 */

import java.util.*;

public class Arrays_09 {
  public static void main(String[] args) {
    int[] a = {3, 2, 1, 5, 4};
    Arrays.sort(a);

    // Ind: 0, 1, 2, 3, 4, 5
    // Ele: 1, 2, 3, 4, 5, 7

    System.out.println(Arrays.binarySearch(a, 2));  // 1
    System.out.println(Arrays.binarySearch(a, 5));  // 2
    System.out.println(Arrays.binarySearch(a, 7));  // -6 (-5 - 1)
    System.out.println(Arrays.binarySearch(a, -4)); // -1 (0 - 1)
  }
}
