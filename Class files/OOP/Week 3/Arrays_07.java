// The Array class and its methods
// The sort() method

// Strings are immutable
// Arrays are mutable

import java.util.*;

public class Arrays_07 {
  public static void main(String[] args) {
    int[] a = {4, 1, 5, 3, 2};
    String[] b = {"Zed", "Anthony", "John"};

    Arrays.sort(a);
    Arrays.sort(b);

    System.out.println(Arrays.toString(b));

    for (int elem : a)
      System.out.println(elem);
  }
}
