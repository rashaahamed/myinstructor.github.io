// Interfaces

/*
 *  In its simplest form, an interface is like a class that contains abstract
 *  methods. An interface cannot be instantiated. Instead, it is implemented by
 *  other classes. When a class implements an interface, the class must
 *  override the methods that are specified by the interface ('contract')
 */

interface Processable {
  void processOne();  // public and abstract
}

class MyClass implements Processable {
  @Override
  public void processOne() {
    System.out.println("Method implementation - interface");
  }

  public void processTwo() {
    System.out.println("My own method");
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.processOne();
    mc.processTwo();
  }
}
