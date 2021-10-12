// Variable scope

import static java.lang.System.*;

public class Scope {
  public static void main(String[] main) {
    int num = 0;
    String name = "Jack";

    int x = 5;
    
    if (x > 0) {
      int y = 10; // very specific scope
    }
    // Error: cannot find symbol 'y'
    out.println(y);

  }
}
