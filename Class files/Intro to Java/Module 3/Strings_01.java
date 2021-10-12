// Strings

/*
 *  The String class is 'final', immutable and doens't need to be instantiated
 *  with the 'new' operator. An immutable class has no setter methods, and the
 *  getters cannot be overriden
 */

 // The StringBuilder - mutable

public class Strings {
  public static void main(String[] args) {
    String name = "John";

    // Johnny is a new string
    // We are using the same reference
    name = "Johnny";

    name.toUpperCase();
    System.out.println(name.toUpperCase());
    System.out.println(name);
  }
}
