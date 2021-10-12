// The Character class

/*
 * The Character class is a wrapper class for the char data type. It provides
 * numerous methods for testing and converting character data
 *
 * isDigit()
 * isLetter()
 * isLetterOrDigit()
 */

public class Char_01 {
  public static void main(String[] main) {
    char r = 'r';
    char n = '7';
    // In Java, digit means number (0 - 9)
    System.out.println(Character.isDigit(r) ? "Is a number" : "Not a number");
    System.out.println(Character.isDigit(n) ? "Is a number" : "Not a number");
  }
}
