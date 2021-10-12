// Comparing numbers

public class Comparison {
  public static void main(String[] main) {
    int a = 5;
    int b = 5;
    double c = 5.0;
    int d = 9;

    System.out.println(a == b); // true
    System.out.println(a == d); // false
    System.out.println(a == c); // true - numeric promotion
  }
}
