// Operators

// ++, --
// *, /
// +, -

// ++ increment operator
// -- decrement operator

public class Operators {
  public static void main(String[] main) {
    int a = 5;
    int b = 7;

    int c = a * b;
    System.out.println(c);

    int d = a + b * c;
    System.out.println(d);

    int e = (a + b) * c;
    System.out.println(e);

    int f = 0;
    System.out.println(f++); // 0
    System.out.println(f);   // 1
  }
}
