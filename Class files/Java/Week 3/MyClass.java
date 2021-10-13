// Classes and objects

public class MyClass {
  // Instance variables - have default values
  String name;

  public void print() {
    System.out.println(this.name);
  }

  public static void main(String[] main) {
    // Instanciating my class (creating an object)
    MyClass mc = new MyClass();
    mc.name = "John Smith";
    mc.print();

    // new MyClass().print();
  }
}
