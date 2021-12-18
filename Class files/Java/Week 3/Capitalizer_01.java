// Code challenge (version 1)

// Write a method that accepsts a string as an argument and returns a copy of
// the string with the first character of each sentence capitalized

// Input: hello. my name is Joe. what is your name?
// Output Hello. My name is Joe. What is your name?

public class Capitalizer {
  public static String capitalize(String str) {
    int period = str.indexOf(".");
    char[] chars = str.toCharArray();

    String result = "";
    chars[0] = Character.toUpperCase(chars[0]);

    while (period != -1) {
      chars[period + 2] = Character.toUpperCase(chars[period + 2]);
      period = str.indexOf(".", period + 2);
    }

    for (char c : chars) {
      result += c;
    }

    return result;
  }

  public static void main(String[] main) {
    String input = "hi. my name is Jack. i live in Winnipeg. what about your?";

    System.out.println(capitalize(input));
  }
}
