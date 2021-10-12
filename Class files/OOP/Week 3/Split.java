// Tokenizing a String

/*
 * Tokenizing a string is a process of breaking a string down into its components,
 * which are called tokens. The String class's split() method can be used to
 * tokenize strings
 */

public class Split {
  public static void main(String[] args) {
    String numbers = "One, Two, Three, Four";
    String[] arr = numbers.split(", ");

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);

    // for (String num : arr) {
    //   System.out.println(num);
    // }
  }
}
