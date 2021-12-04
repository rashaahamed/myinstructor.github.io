// The equalty operator (==)

public class Comparison {
  public static void main(String[] main) {
    String s1 = "Carol Smith"; // pool of strings
    String s2 = "Carol Smith";

    // Two specific objects, in two different addresses
    String pet1 = new String("Cat");
    String pet2 = new String("Cat");

    System.out.println(s1 == s2);
    System.out.println(pet1 == pet2);  // check the reference, not the content
    System.out.println(pet1.equals(pet2)); // checks the content, not the reference
  }
}
