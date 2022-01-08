// Garbage collection (object's lifecycle)

/*
 * Garbage collection refers to the process of automatically freeing memory on
 * the heap by deleting (maybe) objects that are no longer reachable in your
 * program
 */

public class Garbage {
  public static void main(String[] args) {
    // 3 objects and 4 references
    String str1 = new String("One");
    String str2 = new String("Two");
    String str3 = new String("Three");
    String str4 = str3;

    System.out.println(str1);
    str2 = str3;
    // Here we have 2 objects and 4 references

    str1 = null;
    // Here we have 1 object and 4 references
    // Objects 'One' and 'Two' became unreachable, and eligible for GC

    // It is not possible make sure that the GC will collect the unreachable
    // object
  }
}
