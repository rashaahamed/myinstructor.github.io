// Method overloading

/*
 * Method overloading occurs when there are different method signatures with
 * the same name but different type parameters. Overloaded methods may have
 * different access modifiers and return types
 */

public class Methods {
  public static void form(String name, String email) {
    System.out.println("2 argument");
  }

  public static void form(String name, String email, int age) {
    System.out.println("3 arguments");
  }

  public static void form(String name, String email, int age, String gender) {
    System.out.println("4 arguments");
  }

  public static void main(String[] args) {
    form("Steve", "steve@email.com", 32, "male");
    form("John", "john@email.com", 43);
    form("Mary", "mary@email.com");
  }
}
