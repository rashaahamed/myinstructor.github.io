// Wrapper classes

/*
 * The Java API provides wrapper classes for each of the numeric data types.
 * These classes have methods that perform useful operations involving
 * primitive numeric values
 */

public class Wrapper {
  public static void main(String[] main) {
    String s = "23";
    int i = 45;

    System.out.println(s + i);

    int num = Integer.parseInt(s);
    System.out.println(num + 10);

    String backToString = Integer.toString(num);
    System.out.println(backToString + 10);
  }
}
