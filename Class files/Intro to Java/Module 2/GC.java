// Garbage collection

/*
 * Garbage collection refers to the process of automatically freeing memory on
 * the heap by deleting objects that are no longer reachable in you program
 */

public class GC {
  public static void main(String[] args) {
    String s1 = new String("One");
    String s2 = new String("Two");
    String s3 = new String("Three");
    String s4 = s3;

    s2 = s3;
    s1 = null;
    // "One" and "Two" became unreachable, and eligible for Garbage collection
  }
}
