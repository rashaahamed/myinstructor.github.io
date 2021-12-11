// The String class

/*
  The String class is 'final', immutable and doesn't need to be instatiated
  with the 'new' operator
*/

public class Strings_01 {
  public static void main(String[] main) {
    String name = "John Doe";
    name = "Mary Helen"; // This is a new string

    String greetings = new String("Hello, ");

    String str = new String(greetings + name);
    System.out.println(str);
    System.out.println(str.length());
  }
}
