// Anagrams

import java.util.*;

public class Anagrams {
  String keyWord;
  final String[] words = {
    "part", "prat", "pearl", "rapt", "raptor", "tarp",
    "tradition", "trap", "tramp"
  };

  public String getKey(String s) {
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }

  public void getAnagrams(String word) {
    String key = getKey(word);
    String list = "";

    for (String w : words) {
      keyWord = getKey(w);
      if (key.equals(keyWord))
        list += w + ", ";
    }

    String[] array = list.split(", ");
    for (String anagram : array) {
      if (!anagram.equals(word)) {
        System.out.println(anagram.trim());
      }
    }
  }

  public static void main(String[] args) {
    String word = "prat";
    new Anagrams().getAnagrams(word);
  }
}
