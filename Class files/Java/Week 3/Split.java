// String methods (split)

public class Split {
  public static void main(String[] main) {
    String beatles = "John, Paul, George, Ringo";

    String[] arr = beatles.split(", ");

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
  }
}
