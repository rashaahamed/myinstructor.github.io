// The String class and its methods

public class Strings {
  public static void main(String[] main) {
    String str = "Java is an amazing programming language";

    // 0, 1, 2, 3 character => substring(0, 4)
    System.out.println(str.substring(0, 4)); // Java
    System.out.println(str.substring(0, 4).length()); // 4

    System.out.println(str.substring(0, 5)); // Java
    System.out.println(str.substring(0, 5).length()); // 5
    System.out.println(str.substring(0, 5).trim().length()); // 4

    System.out.println(str.substring(str.indexOf(' '), 7)); // _is
    System.out.println(str.substring(str.indexOf(' '), 7).length());
  }
}
