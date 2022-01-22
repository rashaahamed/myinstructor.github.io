// Anagrams

import java.util.*;
import java.util.stream.*;

public class Anagrams_02 {
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
    List<String> list = new ArrayList<>();

    for (String w : words) {
      keyWord = getKey(w);
      if (key.equals(keyWord))
        list.add(w);
    }

    // Streams (since Java 8)
    System.out.println("Anagrams: " + list
      .stream()
      .filter(s -> !s.equals(word))
      .sorted()
      .collect(Collectors.joining(", "))
    );
  }

  public static void main(String[] args) {
    String word = "prat";
    new Anagrams_02().getAnagrams(word);
  }
}
