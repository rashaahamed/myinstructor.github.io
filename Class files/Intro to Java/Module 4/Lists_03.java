// ArrayList

import java.util.*;

public class ArrayList_03 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    // Replaces an elements - returns the original value
    list.set(0, "Z");
    System.out.println(list.get(2));

    System.out.println(list.indexOf("B"));
    System.out.println(list);
  }
}
