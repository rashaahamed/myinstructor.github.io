// Creating methods

/*
 * A method is a block of code which only runs when it is called. Methods are
 * used to perform certain actions, and they are also known as functions
 */

public class Methods {
  public void welcome() {
    System.out.println("Welcome to Java methods");
  }

  public void alternative() {
    System.out.println("Another way to call a method");
  }

  public String name(String name) {
    return name;
  }

  public static void main(String[] args) {
    Methods m1 = new Methods();
    m1.welcome();

    new Methods().alternative();

    String myName = m1.name("John Smith");
    System.out.println(myName);
  }
}
