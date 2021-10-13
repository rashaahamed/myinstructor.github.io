// Wrapper classes

public class Wrapper {
  public static void main(String[] main) {
    String s = "23.45";

    double num = Double.parseDouble(s);
    System.out.println(num);

    String backToString = Double.toString(num);
    System.out.println(backToString + "xx");
  }
}
