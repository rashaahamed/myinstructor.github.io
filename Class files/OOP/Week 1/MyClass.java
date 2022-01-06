// Classes and objects

public class MyClass {
  // Fields (aka instance variables or attributes) go here
  // By default, fields have value and access modifier (package-private)
  int id;       // 0
  String name;  // null
  String email; // null

  // A method without return (or void)
  public void printName() {
    System.out.println("Welcome, " + this.name);
  }

  public int getId() {
    return this.id;
  }

  public static void main(String[] args) {
    // Instantiating my class
    // Using the default constructor, provided by JVM
    MyClass mc1 = new MyClass();
    MyClass mc2 = new MyClass();

    mc1.id = 1010;
    mc1.name = "John Stevenson";
    mc1.email = "johnstv@gmail.com";

    mc2.id = 1020;
    mc2.name = "Jeremy Johnson";

    mc1.printName();
    mc2.printName();

    System.out.println(mc1.getId());

    if (mc2.getId() == 0) {
      System.out.println("Your id is not valid");
    } else {
      System.out.println("Your id is " + mc2.getId());
    }

  }
}
