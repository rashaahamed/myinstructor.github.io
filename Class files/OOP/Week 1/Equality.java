// Equality

public class Equality {
  public static void main(String[] args) {
    String a = "John";
    String b = "John";

    String c = new String("John");
    String d = new String("John");

    System.out.println(a == b);
    System.out.println(c == d);

    // The String class has its own (overriden) version of the equals() method
    // The equals() method is a method that belongs to the Object class
    // By default, the equals() method checks the references, not the content

    System.out.println(c.equals(d));
  }
}
