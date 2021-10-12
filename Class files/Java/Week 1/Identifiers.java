// Identifiers

/*
 * An identifier is a programmer-defined name that represents some element of
 * a program (class, method, variable)
 */

public class Identifiers {
  public static void main(String[] main) {
    int num = 1;
    int $ = 2;
    int _num = 3;
    int $num = 4;
    int _123 = 5;

    int million = 1_000_000; // The underscore will ignored by the compiler

    System.out.println(num);
    System.out.println($);
    System.out.println(_num);
    System.out.println($num);
    System.out.println(_123);
    System.out.println(million);
  }
}
