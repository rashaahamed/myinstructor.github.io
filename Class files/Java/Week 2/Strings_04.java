// The String class

public class Strings_02 {
  public static void main(String[] main) {
    String str= "java is an amazing programming language";
    // Java is case sensitive

    System.out.println(str.startsWith("J")); // false
    System.out.println(str.startsWith("j")); // true
    System.out.println(str.endsWith("x"));   // false
    System.out.println(str.endsWith("e"));   // true
    System.out.println(str.contains("g"));   // true
    System.out.println(str.replace('j', 'J'));
    str = str.replace('j', 'J'); // Creating a new string
    System.out.println(str);
  }
}
