// Overriding equals()

class Class {
  String name;

  Class(String name) {
    this.name = name;
  }

  // The following statement means 'I am overriding the equals method in
  // Object class'
  @Override
  // equals() takes an Object as the method parameter
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Class) {
      Class someObj = (Class) obj;
      // Checks whether the objects have the same 'name'
      return this.name == someObj.name;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Class c1 = new Class("André");
    Class c2 = new Class("André");
    System.out.println(c1.equals(c2));
  }
}
