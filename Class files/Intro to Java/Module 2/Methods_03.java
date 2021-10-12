// Method overloading

/*
 * Method overloading occurs when there are different method signatures with
 * the same name but different type parameters. Overloaded method may have
 * different access modifiers and return types
 */

public class Methods {
  public static void numbers(int a) {
    System.out.println("1 argument");
  }

  public static void numbers(int a, int b) {
    System.out.println("2 arguments");
  }

  public static void numbers(int[] array) {
    System.out.println("Multiple arguments");
  }

  public static void main(String[] args) {
    numbers(5, 9);
    numbers(3);

    int[] num = {1, 2, 3, 4, 5, 6, 7};
    numbers(num);
  }
}
