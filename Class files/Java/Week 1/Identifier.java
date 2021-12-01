// Identifiers

/*
 * An identifier is a programmer-defined name that represents some element
 * of a program (class, method, variable)
 */

// PascalCase -> classes and constructors
// camelCase -> methods, variables, constants

public class Identifier {
  public static void main(String[] arg) {
    int num = 1;
    int $ = 2;
    int _num_ = 3;
    String $name = "Andre";
    int $2 = 222;
    int million = 1_000_000;

    System.out.println(num);
    System.out.println($);
    System.out.println(_num_);
    System.out.println($name);
    System.out.println($2);
    System.out.println(million);
  }
}
