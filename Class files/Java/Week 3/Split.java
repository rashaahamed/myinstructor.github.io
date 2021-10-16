// String methods (split)

public class Split {
  public static void main(String[] main) {
    String beatles = "John, Paul, George, Ringo";

    String[] arr = beatles.split(", ");

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);

    String phoneNumber = "204-123-4567";
    String[] array = phoneNumber.split("-");

    for (String a : array) {
        System.out.println(a);
    }
  }
}
