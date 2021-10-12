// Testing the equals method (strings)

public class TestingEquals {
  public static void main(String[] args) {
    String brand1 = new String("Apple");
    String brand2 = new String("Apple");
    String brand3 = brand1;

    System.out.println(brand1 == brand3);
    System.out.println(brand1 == brand2);
    System.out.println(brand1.equals(brand2));

    int[] a1 = new int[]{1, 2, 3, 4, 5};
    int[] a2 = new int[]{1, 2, 3, 4, 5};

    System.out.println(a1 == a2);
    // The default implementation of the equals method
    System.out.println(a1.equals(a2));
  }
}
