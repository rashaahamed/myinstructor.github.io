// Exceptions

import java.util.*;
import java.text.*;

// The order of exceptions in a multi-catch does not matter

public class Exceptions {
  public static void main(String[] args) {
    int result = 0;
    try {
      int[] array = {0, 1, 2};
      int num = 0;

      // java.lang.ArithmeticException: / by zero or
      // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
      result = 10 / array[3];
    } catch (ArithmeticException | IndexOutOfBoundsException e) {
      System.out.println("Exception: " + e);
    } finally {
      System.out.println("Finally: always executed");
    }
  }
}
