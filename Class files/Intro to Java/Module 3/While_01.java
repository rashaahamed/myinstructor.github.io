// While statement

/*
 * The 'while' loop has two important parts: a boolean expression that is tested
 * for a true or false value, and a statement or block of statements that is
 * repeated as long as the expression is true
 */

public class While {
  public static void main(String[] args) {
    int x = 5;

    while (x > 0) {
      System.out.println(x);
      x--;
    }
  }
}
