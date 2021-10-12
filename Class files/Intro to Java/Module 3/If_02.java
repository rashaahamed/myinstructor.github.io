// The if-else statement

public class IfStatement {
  public static void main(String[] args) {
    String name = "John Doe";
    boolean ready = true;

    // No truthy and falsy values in Java!!!
    // The compiler can't define whether name is true or false
    if (name == "John Doe") {
      System.out.println("Ready");
    }

    if (ready = false) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
