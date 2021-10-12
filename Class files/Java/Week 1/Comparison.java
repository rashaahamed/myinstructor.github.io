// The equality operator (==)

/*
 * For object comparison, the equality operator is applied to the references
 * to the objects, not the objects they point to. Two references are equal if
 * and only if they point to the same object
 */

public class Comparison {
  public static void main(String[] main) {
    String name1 = "John Doe";
    String name2 = "John Doe";

    // Two specific objects, in two different addresses
    String pet1 = new String("Cat");
    String pet2 = new String("Cat");

    System.out.println(name1 == name2);
    System.out.println(pet1 == pet2);
    System.out.println(pet1.equals(pet2));
  }
}
