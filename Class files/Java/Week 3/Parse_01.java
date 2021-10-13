// Parsing numbers

public class Parse {
  public static void main(String[] main) {
    String s1 = "2";
    String s2 = "3.4";
    int i = 2;

    // This is a double -> numeric promotion
    System.out.println(Integer.parseInt(s1) + Double.parseDouble(s2));

    if (Integer.parseInt(s1) == i) {
        System.out.println("\"" + s1 + "\" == " + i);
    }
  }
}
