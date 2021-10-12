// ArrayList

import java.util.*;

public class ArrayList_02 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("C");
    list.add(1, "B");

    System.out.println(list);

    String str = list.remove(2);
    System.out.println(str);
  }
}
