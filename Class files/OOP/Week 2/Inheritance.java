// Inheritance

// Vehicle -> Car, Motorcycle, Plane
// Animal -> Mammal -> Cat, dog, cow

// A class can extend only ONE class, and implement MULTIPLE interfaces
// In class inheritance we have a IS-A relatioship.

class Vehicle {
  String type;

  Vehicle(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}


class Car extends Vehicle {
  String brand;

  Car(String type, String brand) {
    // super() must be the first statement
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

    Motorcycle mc = new Motorcycle("Motorcycle", 350);
    mc.print();
  }
}
