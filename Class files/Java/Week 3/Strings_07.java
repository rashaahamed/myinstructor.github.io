// String methods: split() - tokenize a string

public class Strings {
  public static void main(String[] main) {
    String beatles = "John, Paul, George, Ringo";

    String[] arr = beatles.split(", ");

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);

    String phone = "204-123-4567";
    String[] numbers = phone.split("-");

    // Enhanced for - aka foreach
    for (String n : numbers) {
      System.out.println(n);
    }
  }
}
