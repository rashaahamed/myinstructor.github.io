// Arrays class and its methods

import java.util.*;

public class Arrays_05 {
  public static void main(String[] args) {
    int[] arr1 = {6, 1, 4, 2, 5, 3};
    Arrays.sort(arr1);
    // Arrays are mutable
    arr1[0] = 999;
    System.out.println(Arrays.toString(arr1));
  }
}
