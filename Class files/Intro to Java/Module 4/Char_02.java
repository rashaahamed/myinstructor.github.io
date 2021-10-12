// The Character class and its methods

/*
 * boolean isLetter(char ch)
 * isDigit returns true if the argument passed into 'ch' is an alphabetic letter
 */

public class Char_01 {
  public static void main(String[] args) {
    char r = 'r';
    char n = '7';

    System.out.println(Character.isLetter(r) ? "Letter" : "Not a letter");
    System.out.println(Character.isLetter(n) ? "Letter" : "Not a letter");
  }
}
