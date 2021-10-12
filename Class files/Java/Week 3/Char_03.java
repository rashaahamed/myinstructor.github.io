// The Character class

public class Char_02 {
  public static void main(String[] main) {
    char r = 'r';
    char n = '7';
    char x = '-';

    System.out.println(Character.isLetterOrDigit(r) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(n) ? "Valid" : "Not valid");
    System.out.println(Character.isLetterOrDigit(x) ? "Valid" : "Not valid");
  }
}
