// The Binary search method

/*
  When a value is not found, the program determines its probable position,
  negates it and subracts 1
*/

import java.util.*;

public class Arrays_05 {
  public static void main(String[] args) {
    int[] array = {3, 2, 1, 5, 4};
    Arrays.sort(array);

    // Ind: 0, 1, 2, 3, 4
    // Ele: 1, 2, 3, 4, 5

    System.out.println(Arrays.binarySearch(array, 2));  // 1
    System.out.println(Arrays.binarySearch(array, 5));  // 4
    System.out.println(Arrays.binarySearch(array, 7));  // -6 (-5 -1)
    System.out.println(Arrays.binarySearch(array, -3)); // -1
  }
}
