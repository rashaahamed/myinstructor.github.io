// String class and its methods

public class Strings {
  public static void main(String[] args) {
    String firstName = "Andre ";
    String lastName = "Specht";
    String fullName = firstName + " " + lastName;

    System.out.println(fullName);

    String fullName2 = firstName.concat(lastName);
    System.out.println(fullName2);

    String pet = new String("Cat");

    char[] array = {'S', 't', 'r', 'i', 'n', 'g'};
    String str = new String(array);
    System.out.println(str);
  }
}
