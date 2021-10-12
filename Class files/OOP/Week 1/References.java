// References

/*
 * Primitives: hold their values in the memory where the variable is allocated
 * References: point to an object by storing the memory address where the object
 * is located
 *
 * Instantiate == create a new object
 */

public class References {
  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = "Hi";

    References r1 = new References();
    References r2 = new References();
  }
}
