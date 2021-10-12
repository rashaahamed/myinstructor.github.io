// Variable scope

public class Scope {
  // These are instance variables
  String name;    // Null
  int num;        // 0
  double x;       // 0.0
  boolean valid;  // false

  public static void main(String[] args) {
    // Local variable
    // Local variables must be initialized before use
    int x = 5;
    int counter;

    if (x > 0) {
      int y = 10;
    }
    // Error 1: Java cannot find symbol 'y' ??
    // System.out.println(y);

    // Error 2: variable counter might not have been initialized
    // System.out.println(counter);

    System.out.println(name);
  }
}
