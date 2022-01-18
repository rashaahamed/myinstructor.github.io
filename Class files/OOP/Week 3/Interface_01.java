// Interfaces

/*
  In its simplest form, an interface is a like a class that contains abstract
  methods. An interface cannot be instantiated. Instead, it is implemented by
  other classes. When a class implements an interface, the class must override
  the methods that are specified by the interface ('contract')

  The methods in an interface tell WHAT to do, and not HOW dow

  A class can implement multiple interfaces at same time
*/

interface Processable {
  void processOne(); // This method is implicitly public and abstract
}

public class Interface_01 implements Processable {
  @Override public void processOne() {
    System.out.println("Method from the interface");
  }

  public void processTwo() {
    System.out.println("My own method");
  }

  public static void main(String[] args) {
    Interface_01 itc = new Interface_01();
    itc.processOne();
    itc.processTwo();
  }
}
