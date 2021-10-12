// Encapsulation

/*
 * In Java, encapsulation is commonly implemented with private instance members
 * that have public methods to retrieve or modify the data, commonly referred
 * to as 'getters' and 'setters'
 */

public class Encapsulation {
  private String name;
  private int age;

  public void setName(String name) {
    // You can use the setters to validate you data
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    Encapsulation e = new Encapsulation();
    e.setName("Charles Darwin");
    e.setAge(73);

    System.out.println(e.getName() + ", " + e.getAge());
  }
}
