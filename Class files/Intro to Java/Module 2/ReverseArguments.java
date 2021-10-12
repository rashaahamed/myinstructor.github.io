// Arguments

/* Challenge 2
 *
 *  Write a program that prints the arguments passed to the main() method in
 *  reverse order
 *
 *  Example
 *  Input: My name is John
 *  Output: John is name My
 */

public class ReverseArguments {
  public static void main(String[] args) {
    for (int i = args.length - 1; i >= 0; i--) {
      System.out.print(args[i] + " ");
    }
    System.out.println();
  }
}
