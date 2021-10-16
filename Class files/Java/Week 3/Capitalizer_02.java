// Code challenge (alternative version)

import java.util.*;

public class Capitalizer {
  public static String capitalize(String str) {
    String[] arr = str.split("\\. ");
    String result = "";

    System.out.println(arr.length);
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
    }

    result = arr[0] + ". " + arr[1] + ". " + arr[2];
    return result;
  }

  public static void main(String[] main) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a phrase to be capitalized: ");
    String phrase = scan.nextLine();

    System.out.println(capitalize(phrase));
  }
}
