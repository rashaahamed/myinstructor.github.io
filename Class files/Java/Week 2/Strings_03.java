// The String class

public class Strings_02 {
  public static void main(String[] main) {
    String s1 = "99";
    String s2 = "55";

    int n1 = 1;
    int n2 = 2;

    System.out.println(s1 + s2);
    System.out.println(s1 + n1);
    System.out.println(n1 + n2);
    System.out.println(s1 + n1 + n2);
    System.out.println(s1 + (n1 + n2));
    System.out.println(n1 + n2 + s1);

    String ja = "Ja";
    String va = "va";
    System.out.println(ja + va);
    System.out.println(ja.concat(va));
  }
}
