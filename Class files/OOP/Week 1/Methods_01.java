// Creating methods

/*
 * A method is a block of code which only runs when it is called. Methods are
 * used to perform certain actions, and they are also known as functions
 *
 * Reusable components
 */

public class Methods_01 {
  public void welcome() {
    System.out.println("Welcome to Java methods");
  }

  // 'String name' is our paremeter. The value the method needs
  public String name(int num) {
    return "My number is " + num;
  }

  public static void main(String[] args) {
    Methods_01 met = new Methods_01();
    met.welcome();

    // "Mary Helen" is an argument, the "String name" of the method
    met.name(78);
    System.out.println(met.name(7));
  }
}
