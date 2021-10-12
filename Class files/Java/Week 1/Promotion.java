// Numeric promotion

public class Promotion {
  public static void main(String[] main) {
     int a = 5;
     int b = 7;
     int c = a + b;

     double x = 4.8;
     double y = a + x;

     System.out.println(c);
     System.out.println(a + x); // a is promoted to a double
  }
}
