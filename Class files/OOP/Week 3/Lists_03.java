// List and ArrayList (collections)

import java.util.*;

public class Lists_03 {
  public static void main(String[] args) {
    String[] names = {"Teddy", "John", "Mary"};

    List<String> list = Arrays.asList(names);

    Collections.sort(list);

    // Enhanced for
    for (String str : list) {
      System.out.println(str);
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    // See functional interfaces (FIs)
    list.forEach(System.out::println);
  }
}
