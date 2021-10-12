// The String class and its methods (part 2)

/*
 * Tokenizing a string is a process of breaking a string down into its components,
 * which are called tokens. The String class' split() method can be used to
 * tokenize string
 */

public class Strings_01 {
  public static void main(String[] args) {
    String beatles = "John. Paul. George. Ringo";
    String[] arr = beatles.split(", ");

    // for (String name : arr) {
    //   System.out.println(name);
    // }

    String ip = "192.168.0.123";
    String[] octets = ip.split("\\.");

    for (String oct : octets) {
      System.out.println(oct);
    }

  }
}
