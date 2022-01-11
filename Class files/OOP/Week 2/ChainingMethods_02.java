// Chaining methods

public class MyClass {
  String firstName;
  String lastName;

  public MyClass setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public MyClass setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  public void print() {
    System.out.println(this.getFullName());
  }

  public static void main(String[] args) {
    new MyClass().setFirstName("John").setLastName("Smith").print();
  }
}
