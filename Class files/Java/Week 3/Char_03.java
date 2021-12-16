// The Character class

public class Char_03 {
  public static void main(String[] main) {
    char r = 'r';
    char n = '9';
    char x = '-';

    System.out.println(Character.isLetterOrDigit(r) ? "Valid" : "Not valid"); // Valid
    System.out.println(Character.isLetterOrDigit(n) ? "Valid" : "Not valid"); // Valid
    System.out.println(Character.isLetterOrDigit(x) ? "Valid" : "Not valid"); // Not valid
  }
}
