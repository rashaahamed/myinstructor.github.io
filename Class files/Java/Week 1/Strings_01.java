// The String class

/*
 * The String class if final, immutable and doens't need to be instantiated with
 * the 'new' operator
 */

public class Strings {
  public static void main(String[] main) {
    String name = "Mary Helen"; // 'Mary Helen' is an object in the memory
    String greetings = new String("Hello, ");

    String str = new String(greetings + name);

    System.out.println(name);
    System.out.println(greetings);
    System.out.println(str);

    System.out.println(str.length());
  }
}
