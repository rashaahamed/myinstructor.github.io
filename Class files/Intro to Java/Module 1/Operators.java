// Operators

/*
 *  Unless overriden with parenthese, Java operator follow this order:
 *  ++. -- (pre/post-unary operators)
 *  *, /, % (multi., division, modulus)
 *  +, -
 */

public class Operators {
  public static void main(String[] args) {
    int x = 9;

    System.out.println(x);
    int w = 8 + 7 - x--;
    System.out.println(x);

    // int y = 8 + 7 - --x;
    // int z = 3 * y - x / 2;

    // System.out.println(y);
    // System.out.println(z);
    System.out.println(w);
  }
}
