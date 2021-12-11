// The String class

public class Strings_02 {
  public static void main(String[] main) {
    char[] s1 = {'S', 't', 'r', 'i', 'n', 'g'};
    String s2 = new String(s1);
    String s3 = s1; // This is not allowed!!

    System.out.println(s2);
  }
}
