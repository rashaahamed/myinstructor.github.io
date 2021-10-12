// Constants

/*
 * The 'final' keyword can be used in a variable declaration to make the variable
 * a named constant. Named constants are initialized with a value, and that
 * value cannot change during the execution of the program
 */

public class Constants {
  public static void main(String[] main) {
    final int SIN = 123456789;
    final int ID = 444890;

    SIN = 1111111;

    System.out.println(SIN);
    System.out.println(ID);
  }
}
