// Variable scope

public class Scope {
  public static void main(String[] main) {
    int x = 5;
    String name = "Jack";

    if (x > 0) {
      int y = 10; // very specific scope (block of code)
    }
    // Error: cannot find symbol 'y'
    System.out.println(y);
  }
}
