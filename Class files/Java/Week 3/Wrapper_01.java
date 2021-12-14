// Wrapper classes

/*
  The Java API provides wrapper classes for each of the numeric data types.
  These classes have methods that perform useful operation involving primitive
  numeric values
*/

// Character -> char
// Integer -> int

public class Wrapper_01 {
  public static void main(String[] main) {
    String s = "23";
    int i = 45;

    int toNum = Integer.parseInt(s);
    System.out.println(toNum + 10); // 33

    String backToString = Integer.toString(toNum);
    System.out.println(backToString);
  }
}
