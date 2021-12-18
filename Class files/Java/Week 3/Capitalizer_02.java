// Code challenge (version 2)

public class Capitalizer {
  public static String capitalize(String str) {
    String[] arr = str.split("\\. ");
    String result = "";

    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
    }

    result = arr[0] + ". " + arr[1] + ". " + arr[2] + ". " + arr[3];
    return result;
  }

  public static void main(String[] main) {
    String input = "hi. my name is Jack. i live in Winnipeg. what about you?";
    System.out.println(capitalize(input));
  }
}
