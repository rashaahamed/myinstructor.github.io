// The Character class and its methods

/*
 * boolean isLetterOrDigit(char ch)
 * isLetterOrDigit returns true if the argument passed into 'ch' contains a
 * a digit (0-9) or a letter
 */

public class Char_01 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';
    char x = '-';
    char y = '*';

    System.out.println(Character.isLetterOrDigit(r) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(n) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(x) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(y) ? "Valid" : "Not valid");
  }
}
