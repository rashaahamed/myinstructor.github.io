// The String class and its methods

public class Strings {
  public static void main(String[] main) {
    String str = "java is an amazing programming language";
    // Java is case sensitive

    System.out.println(str.startsWith("J")); // true
    System.out.println(str.startsWith("j")); // false
    System.out.println(str.endsWith("x")); // false
    System.out.println(str.endsWith("e")); // true
    System.out.println(str.contains("g")); // true
    System.out.println(str.replace('j', 'J')); // Java is an amazing programming language
    System.out.println(str); // Original string. Strings are immutable
  }
}
