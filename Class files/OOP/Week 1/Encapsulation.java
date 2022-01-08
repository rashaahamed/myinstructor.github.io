// Encapsulation

/*
 * In Java, encapsulation is commonly implemented with private instance members
 * that have public methods to retrieve or modify the data, commonly referred
 * to as getters and setters, respectively
 *
 * Encapsulation means private instance variables + public getters/setters
 */

public class Encapsulation {
  private String name;
  private int age;

  public void setName(String name) {
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
    Encapsulation enc = new Encapsulation();
    enc.setName("Carol Jones");
    enc.setAge(37);

    System.out.println(enc.getName());
    System.out.println(enc.getAge());

  }
}
