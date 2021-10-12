// Constructors

/*
 * There are two key points to note about constructors: the name of the
 * constructor matches the name of the class, and there's no return type
 */

 // 4 access modifiers: public, private, protected, package-private
 // Object class: the parent of all classes

public class Constructor {
  String name;
  int age;

  // Constructor() { }

  // Since a constructor is coded, a default constructor is not supplied
  Constructor(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.age;
  }

  public static void main(String[] args) {    
    Constructor cons = new Constructor("Mary Smith", 39);
    System.out.println(cons);
  }
}
