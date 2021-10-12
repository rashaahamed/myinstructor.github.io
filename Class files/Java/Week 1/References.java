// References

/*
 * A reference type refers to an object. Unlike primitive types that hold their
 * values in the memory where the variable is allocated, reference types point
 * to an object by storing the memory address where the object is located
 *
 * String name = "Mary" ('name' is a reference to an object ('Mary'))
 *
 */

public class References {
  public static void main(String[] main) {
    String name = "John Doe";
    String otherName = "Patrick Smith";

    // The 'new' operator is called 'constructor' - we are creating an object
    String pet = new String("Cat");

    System.out.println(name.toUpperCase());
    System.out.println(otherName.toLowerCase());
  }
}
