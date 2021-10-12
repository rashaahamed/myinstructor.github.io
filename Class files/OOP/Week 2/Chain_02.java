// Chaining my methods

public class Chain {
  private String name;

  public Chain setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public void print() {
    System.out.println(this.getName());
  }

  public static void main(String[] args) {
    new Chain().setName("Andre Specht").print();
  }
}
