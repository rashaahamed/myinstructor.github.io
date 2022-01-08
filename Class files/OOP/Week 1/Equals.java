// Overriding the equals() method

public class Person {
  String name;
  int age;

  Person(String name) {
    this.name = name;
  }

  // equals() is a method from the Object class. By default, equals() compare
  // references, not data
  @Override
  // equals() takes an object as a parameter
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof Person) {
      Person person = (Person) obj;
      return this.name == person.name;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Person john = new Person("John Stevenson");
    Person tony1 = new Person("Tony Smith");
    Person tony2 = new Person("Tony Smith");

    System.out.println(tony1.equals(tony2));
  }
}
