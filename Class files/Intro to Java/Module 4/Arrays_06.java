// Arrays class and its methods

/*
 * The binarySearch method
 * When a value is not found, the program determines its probable position,
 * negates it and subtracts 1
 */

import java.util.*;

public class Arrays_06 {
  public static void main(String[] args) {
    int[] arr = {1, 4, 2, 5, 3};
    String[] str = {"A", "B", "C", "D"};
    Arrays.sort(arr);
    // Ind: 0, 1, 2, 3, 4
    // Ele: 1, 2, 3, 4, 5

    System.out.println(Arrays.binarySearch(str, "A"));  //  1
    System.out.println(Arrays.binarySearch(str, "C"));  //  4
    System.out.println(Arrays.binarySearch(str, "E"));  // -6 (-5 - 1 == -6)
    System.out.println(Arrays.binarySearch(arr, -4)); // -1 (0 - 1)
  }
}
