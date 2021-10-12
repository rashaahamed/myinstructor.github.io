// Chaining methods

public class Methods {
  public static void main(String[] args) {
    String str = " anDRE ";
    String stc = "I love Java, my friend";

    String result = str.trim().toLowerCase().replace('a', 'A');
    System.out.println(result);

    String language = stc.substring(stc.indexOf('J'), stc.indexOf(','));
    System.out.println(language);
  }
}
