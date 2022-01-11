// Inheritance

// Vehicle -> Car, Motorcycle, plane
// Animal -> Mammal -> Cat, dog, cow

class Vehicle {
  String type;

  Vehicle(string type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }
}


class Car extends Vehicle {
  String brand;
}


class Motorcycle extends Vehicle {
  int speed;
}


public class Inheritance {
  public static void main(String[] args) {

  }
}
