// References

/*
 * A reference type refers to an object. Unlike primitive types
 * that hold their values in the memory where the variable is
 * allocated, reference types point to an object by storing the
 * memory address where the object is located
 */

public class References {
  public static void main(String[] main) {
    // Primitive types: boolean, int, double, char, short, byte, float, long
    int a = 7;
    int b = a; // 'b' get a copy of 'a's' value
    a = a * 2;
    System.out.println(a + " | " + b);

    String name1 = "John"; // immutable
    String name2 = name1;
    name1 = name1.toUpperCase();
    System.out.println(name1 + " | " + name2);

  }
}
