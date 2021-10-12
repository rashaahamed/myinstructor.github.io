// Exceptions

/*
 * An exception is an object that is generated as the result of an error or
 * unexpected event. To prevent exceptions from crashing your program, you must
 * write code that detects and handles them
 */

public class Exceptions {
  public static void main(String[] args) {
    try {
      int[] array = {1, 2, 3};

      for (int i = 0; i <= array.length; i++) {
          array[i] = i + 1;
          System.out.println(array[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Exception: " + e);
    }
  }
}
