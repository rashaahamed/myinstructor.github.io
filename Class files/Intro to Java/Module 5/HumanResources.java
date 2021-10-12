// Inheritance

/*
 *  Inheritance allows a new class to extend an existing class. The new class
 *  inherits the members of the class it extends
 *
 *  Child/Subclass -> extends -> Parent/Superclass
 *  Vehicle (parent) -> Car, Airplane, Mororcycle
 *  Person -> Man, Adult, Employee
 *  Is-a relationship
 *
 *  The Object class
 */

class Employee {
  String name;
  int id;
}

class Driver extends Employee {
  public void jobTitle() { System.out.println("I am a driver"); }

  @Override
  public String toString() {
    return "Name: " + this.name + " | Id: " + this.id;
  }
}

class Supervisor extends Employee {
  public void jobTitle() { System.out.println("I am a supervisor"); }

  @Override
  public String toString() {
    return "Name: " + this.name + " | Id: " + this.id;
  }
}

public class HumanResources {
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.name = "John Smith";
    driver.id = 1234;

    System.out.println(driver);

    Supervisor supervisor = new Supervisor();
    supervisor.name = "Helen Jones";
    supervisor.id = 4567;

    System.out.println(supervisor);
  }
}
