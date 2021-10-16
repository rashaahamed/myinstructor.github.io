// Code challenge

// Write a method that accepts a string as an argument and returns a copy of
// the string with the first character of each sentence capitalized

// Input: hello. my name is Joe. what is your name?
// Output: Hello. My name is Joe. What is your name?

import java.util.*;

public class Capitalizer {
  public static String capitalize(String str) {
    int period = str.indexOf(".");
    char[] chars = str.toCharArray();

    String result = "";
    chars[0] = Character.toUpperCase(chars[0]);

    while (period != -1) {
      chars[period + 2] = Character.toUpperCase(chars[period + 2]);
      period = str.indexOf(". ", period + 1);
    }

    for (char c : chars) {
      result += c;
    }

    return result;
  }

  public static void main(String[] main) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a phrase to be capitalized: ");
    String phrase = scan.nextLine();

    System.out.println(capitalize(phrase));
  }
}
