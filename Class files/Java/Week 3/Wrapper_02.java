// Wrapper classes

public class Wrapper_02 {
  public static void main(String[] main) {
    String s = "23.45";
    int i = 12;

    double num = Double.parseDouble(s);
    System.out.println(num);

    String str = Double.toString(num);
    System.out.println(str);

    // Java is strongly typed language
    var result = num + i; // double
    System.out.println("\"" + result + "\"");

    String s1 = "5";
    String s2 = "7";
    System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
  }
}
