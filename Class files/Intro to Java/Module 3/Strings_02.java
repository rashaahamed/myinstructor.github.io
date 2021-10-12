// String class and its methods

public class Strings {
  public static void main(String[] args) {
    String name = "Charles Darwin";

    System.out.println(name.length());

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.contains("l"));
    System.out.println(name.startsWith("c"));
    System.out.println(name.endsWith("n"));

    String newLastName = name.replace("Darwin", "Xavier");
    System.out.println(newLastName);
  }
}
