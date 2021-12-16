// Classes and objects
// Blueprint for objects
// SOLID principles: set of golden rules for OO programmers

public class MyClass {
  String name; // null, by default
  int age;     // 0, by default

  public void print() {
    System.out.println("Hello " + this.name + ", " + this.age);
  }

  public void print(String name, int age) {
    System.out.println("Hello " + name + ", " + age);
  }

  public static void main(String[] main) {
    // Instantiating MyClass with the default constructor
    MyClass mc = new MyClass();
    mc.name = "John Smith";
    mc.age = 37;

    mc.print();
    new MyClass().print("Jack Jones", 56);
  }
}
