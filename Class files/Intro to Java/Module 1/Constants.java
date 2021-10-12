// Constants

/*
 *  The 'final' keyword can be used in a variable declaration to make the
 *  variable a named constant
 */

public class Constants {
  public static void main(String[] args) {
    final int SIN = 333666999;
    final double ID = 123456;

    System.out.println(SIN);
    System.out.println(ID);

    // Java is case-sensitive, SIN != sin != Sin
    // System.out.println(sin);
  }
}
