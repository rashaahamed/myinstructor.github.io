// Numberic promotion

import static java.lang.System.*;

public class Promotion {
  public static void main(String[] main) {
    int a = 5;
    int b = 7;
    int c = a + b;

    double x = 4.8;
    // the int will converted into a double
    double res = a + x;

    out.println(c);
    out.println(res);   // 9.8 -> double
    out.println(a + x); // 9.8 -> double
  }
}
