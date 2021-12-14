// Checking if a string is empty or blank

public class Strings {
  public static void main(String[] main) {
    String empty = "";
    String blank = "   ";
    String name = "Tommy";

    System.out.println(empty.isEmpty());  // true
    System.out.println(empty.isBlank());  // true

    System.out.println(blank.isEmpty());  // false
    System.out.println(blank.isBlank());  // true
    System.out.println(blank.trim().isEmpty());  // true
    System.out.println(blank.trim().isBlank());  // true

    // 'is' and 'has' return a Boolean (true/false)
    if (!name.isBlank() && name.length() >= 2) {
      System.out.println("Name is valid");
    } else {
      System.out.println("Name is invalid");
    }
  }
}
