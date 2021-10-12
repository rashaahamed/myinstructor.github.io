// Import statement

/*
 * The import statement allows you to import an entire package or use only
 * certain classes and interfaces defined in the package.
 *
 * The 'java.lang' package (System, String...) is available by default
 */

import java.util.*;
// Java will import the classes I need

public class Import {
  public static void main(String[] args) {
    System.out.println(new Random().nextInt(9) + 1);
  }
}
