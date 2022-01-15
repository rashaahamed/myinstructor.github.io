// My template

class Person {
  private String name, address, phone;

  // The 'default' constructor
  Person() { }

  Person(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
  }

  public void setName(String name) { this.name = name; }
  public String getName() { return this.name; }

  public void setAddress(String address) { this.address = address; }
  public String getAddress() { return this.address; }

  public void setPhone(String phone) { this.phone = phone; }
  public String getPhone() { return this.phone; }
}

class Customer extends Person {
  private int customerNumber;
  private boolean preference;

  Customer() { }

  Customer(String name, String address, String phone, int number, boolean preference) {
    super(name, address, phone);
    this.customerNumber = number;
    this.preference = preference;
  }

  public void setNumber(int number) { this.customerNumber = number; }
  public int getNumber() { return this.customerNumber; }

  public void setPreference(boolean pref) { this.preference = pref; }
  public String getPreference() {
    String str = "No";

    if (this.preference)
      str = "Yes";

    return str;
  }

  @Override
  public String toString() {
    String data = "Number: " + getNumber() + "\n" +
                  "Name: " + getName() + "\n" +
                  "Address: " + getAddress() + "\n" +
                  "Phone: " + getPhone() + "\n" +
                  "Mailing list: " + getPreference();
    return data;
  }
}

public class MailingList {
  public static void main(String[] args) {
    Customer john = new Customer();
    john.setNumber(2738);
    john.setName("John Smith");
    john.setAddress("345 Notre Dame Avenue");
    john.setPhone("234-750-8500");
    john.setPreference(true);

    System.out.println(john);
    System.out.println();

    Customer mary = new Customer("Mary Jones", "788 La Rue", "119-847-9083", 3870, false);
    System.out.println(mary);
  }
}
