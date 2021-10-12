class Vehicle {
  String type;

  // Constructor with 1 argument (non-default constructor)
  Vehicle(String type) {
    this.type = type;
  }

  public String getType() { return this.type; }
}


class Car extends Vehicle {
  // String type (from Vehicle class)
  String brand;

  Car(String type, String brand) {
    // Super should be the first statement
    super(type);
    this.brand = brand;
  }

  public void print() {
    System.out.println("Type: " + this.type + " | Brand: " + this.brand);
  }
}


class Motorcycle extends Vehicle {
  int speed;

  Motorcycle(String type, int speed) {
    super(type);
    this.speed = speed;
  }

  public void print() {
    System.out.println("Type: " + this.type + " | Max speed: " + this.speed);
  }
}


public class Inheritance {
  public static void main(String[] args) {
    Car car = new Car("Car", "Ferrari");
    car.print();

    // constructor Car in class Car cannot be applied to given types
    // Car car1 = new Car();

    Motorcycle motorcycle = new Motorcycle("Motorcycle", 300);
    motorcycle.print();
  }
}
