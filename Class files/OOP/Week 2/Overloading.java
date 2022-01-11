// Method overloading

/*
 * Method overloading occurs when there are different method signatures with
 * the same name but different type parameters. An overloaded method may have
 * different access modifier and return type
 */

public class Overloading {
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
    int[] num = {1, 2, 3, 4, 5};
    numbers(num);

    numbers(5, 9);
    numbers(7);
  }
}
