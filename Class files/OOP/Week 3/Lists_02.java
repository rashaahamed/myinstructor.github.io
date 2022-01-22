// List and ArrayList (collections)

import java.util.*;

public class Lists_02 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Joe");
    names.add("Joseph");
    names.add("Jose");
    names.add("Joe");

    System.out.println(names.indexOf("Joseph"));
    System.out.println(names.lastIndexOf("Joe"));
  }
}
