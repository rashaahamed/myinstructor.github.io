// The String class and its methods (part 2)

public class Strings_02 {
  public static void main(String[] args) {
    String empty = "";
    String blank = "    ";
    String name = "Jerry";

    System.out.println(empty.isEmpty());
    System.out.println(blank.isEmpty());
    System.out.println(empty.isBlank()); // Blank && empty
    System.out.println(blank.isBlank());

    // Validation
    if (!name.isBlank()) {
      System.out.println("Name is valid");
    }
  }
}
