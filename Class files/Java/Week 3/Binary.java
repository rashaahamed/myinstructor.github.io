// Parsing numbers

// 1 1 1 1 == 15
// 1 1 1 1 1 1 1 1 == 255

public class Binary {
  public static void main(String[] main) {
    System.out.println(Integer.toBinaryString(5));
    System.out.println(Integer.toBinaryString(15));
    System.out.println(Integer.toBinaryString(255));

    System.out.println(Integer.parseInt("101", 2));
    System.out.println(Integer.parseInt("1111", 2));
    System.out.println(Integer.parseInt("11111111", 2));
  }
}
