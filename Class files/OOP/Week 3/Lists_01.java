// List and ArrayList (collections)

/*
  List in Java provides the facility to maintain the ordered collection. It
  contains the index-based methods to insert, update, delete and serach the
  elements. It can have duplicate elements also
*/

import java.util.*;

public class Lists_01 {
  public static void main(String[] args) {
    // See 'Dependency injection' (the 'D' from SOLID)

    List<String> list = new ArrayList<>();
    list.add("Banana");     // Adds an element an returns a boolean
    list.add("Strawberry");
    list.add("Apple");

    String fruit = list.remove(1);  // Removes and return an element
    System.out.println(fruit);
    // list.remove("Banana"); This works

    System.out.println(list.get(0));
    list.set(1, "Strawberry");  // set means replace

    System.out.println(list);
  }
}
