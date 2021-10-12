// ArrayList

import java.util.*;

public class ArrayList_04 {
  public static void main(String[] args) {
    String[] names = {"Jeremy", "Zack", "Annie"};
    // Converting an array to a list
    List<String> list = Arrays.asList(names);

    // ArrayLists are mutable
    Collections.sort(list);

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      // System.out.println(list.get(i));
    }

    for (String name : list) {
      // System.out.println(name);
    }

    list.forEach(System.out::println);
    // Consumer interface (functional interfaces)
  }
}
