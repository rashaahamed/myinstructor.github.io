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

    d = d - 10;
    System.out.println(d);

    int e = 0;
    e++;
    ++e;
    e--;
    --e;
    System.out.println(e);
  }
}
