// Multidimentsional array (2D)

import java.util.*;

public class Arrays_04 {
  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5, 6};
    int[] arr2 = arr1;
    int[] arr3 = {1, 2, 3, 4, 5, 6};

    System.out.println(arr1 == arr2);
    System.out.println(arr1.equals(arr2));
    // The Arrays doesn't implement the equals() method
    // It uses the version from the Object class
    // Compares only references
    System.out.println(arr1.equals(arr3));

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr3));
  }
}
