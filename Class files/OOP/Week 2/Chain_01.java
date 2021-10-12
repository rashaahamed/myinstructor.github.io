// Chaining methods

public class Chain {
  public static void main(String[] args) {
    String original = " anDRE ";
    // _anDRE_ -> Andre
    String lan = "I love Java, my friend";

    System.out.println(original);
    String name = original.trim().toLowerCase().replace('a', 'A');
    System.out.println(name);

    String language = lan.substring(lan.indexOf('J'), lan.indexOf(','));
    System.out.println(language);
  }
}
