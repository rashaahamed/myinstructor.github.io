// Static methods

// We don't need objects (references) to use/call static class members

public class Static {
  static int num;

  public static void print(String student) {
    System.out.println("Welcome to my class, " + student + " (" + num + ")");
  }

  public static void main(String[] args) {
    String student = "Jennifer Smith";
    num = 345987;
    print(student);
  }
}
