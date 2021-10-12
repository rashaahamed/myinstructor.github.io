// Variable scope

public class Scope {
  public static void main(String[] args) {
    int x = 5;
    int z = 7;

    if (x > 1) {
      // Local variable (its scope is very limited)
      int y = 100;
      System.out.println(z);
    }

    // System.out.println(y);
    // The println method and the variable 'z' have the same scope
    System.out.println(z);
  }
}
