// Encapsulation

/*
 * In Java, encapsulation is commonly implemented with private instance
 * members that have public methods to retrieve or modify the data, commonly
 * referred to as getters and setters, respectively
 *
 * Private instance variables & public methods to set/get these variables (values)
 *
 */

public class Encapsulation {
  private String name;
  private int id;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return this.id;
  }

  public static void main(String[] args) {
    Encapsulation enc = new Encapsulation();
    enc.setName("John");
    enc.setId(444_555_666);

    System.out.println(enc.getName());
    System.out.println(enc.getId());
  }
}
