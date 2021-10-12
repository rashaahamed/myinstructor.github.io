// Primitive types

/*
 *  Java has 8 primitive types. These data types represent the building blocks
 *  for Java objects. These data types are called 'primitive' because you cannot
 *  use them to create objects, or call methods
 *
 * These "rules" (conventions) are for yourself (your future self)
 */

public class Primitive {
  public static void main(String[] args) {
    boolean a = true;      // 1 bit
    char b = 'b';          // 16 bits
    byte c = 3;            // 8 bits
    short d = 4;           // 16 bits
    int e = 5;             // 32 bits
    long f = 6666666666l;  // 64 bits
    float g = 7.0f;        // 32 bits
    double h = 8.0;        // 64 bits

    int i = 5_000_000;     // This is OK
    System.out.println(i);
  }
}
