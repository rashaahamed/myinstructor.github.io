// The Character class and its methods

/*
 * The Character class os a wrapper class for the char data type
 *
 * boolean isDigit(char ch)
 * isDigit returns true if the argument passed into 'ch' is a digit (0 - 9)
 */

public class Char_01 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    System.out.println(Character.isDigit(r) ? "Number" : "Not a number");
    System.out.println(Character.isDigit(n) ? "Number" : "Not a number");
  }
}
