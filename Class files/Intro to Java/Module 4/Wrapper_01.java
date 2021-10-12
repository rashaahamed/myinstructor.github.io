// The wrapper classes

/*
 * The Java API provides wrapper classes for each of the primitive data types.
 * These classes have methods that perform useful operations involving primitive
 * values
 */

public class Wrapper {
  public static void main(String[] args) {
    String s = "23";
    int i = 45;

    int toInteger = Integer.parseInt(s);
    String toString = Integer.toString(i);

    System.out.println(toInteger);
    System.out.println(toString);
  }
}
