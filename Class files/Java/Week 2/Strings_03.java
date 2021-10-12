// The String class and its methods

public class Strings {
  public static void main(String[] main) {
    String empty = "";
    String blank = "    "; // This is not empty. White space is a character
    String name = "Jerry";

    System.out.println(empty.isEmpty()); // true
    System.out.println(empty.isBlank()); // true

    System.out.println(blank.isEmpty()); // false
    System.out.println(blank.isBlank()); // true

    // Valid
    if (!name.isBlank()) {
      System.out.println("Name is valid");
    } else {
      System.out.println("Name is not valid. Try again");
    }
  }
}
