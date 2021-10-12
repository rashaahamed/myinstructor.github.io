// Using parent class' constructor

class Vehicle {
  String type;

  Vehicle(String type) {
    this.type = type;
  }
}

class Car extends Vehicle {
  String brand;

  Car(String type, String brand) {
    super(type);
    this.brand = brand;
  }

  public void printCar() {
    System.out.println("Type: " + this.type + " | Brand: " + this.brand);
  }
}


public class Test {
  public static void main(String[] args) {
    Car car = new Car("Car", "Ferrari");
    car.printCar();
  }
}
