// Inheritance

// Child class -> extends -> parent class
// Vehicle -> Car, Airplane, Motorcycle
// Person -> Man, Woman, Child, Employee
// is-a relationship

class Employee {
  int id;
  String name;
  double salary;

  public void jobTitle() { System.out.println("I am an employee"); }
}

class Driver extends Employee {
  public void jobTitle() { System.out.println("I am a driver"); }
}

class Supervisor extends Employee {
  public void jobTitle() { System.out.println("I am a supervisor"); }
}

public class HumanResources {
  public static void main(String[] args) {
    Driver driver = new Driver();
    driver.id = 1234;
    driver.name = "Jerry";
    driver.salary = 45_000;

    System.out.println(driver.id);

    Supervisor supervisor = new Supervisor();
    supervisor.id = 5678;
    supervisor.name = "Mary";
    supervisor.salary = 70_000;

    System.out.println(supervisor.name);
  }
}
