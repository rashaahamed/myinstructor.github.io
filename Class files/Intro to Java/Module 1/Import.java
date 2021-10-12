// The import statement

/*
 *  The import statement allows you to import an entire package or use only
 *  certain classes and interfaces defined in the package
 *
 *
 *  PIC (package, import(s), class)
 *
 *  The '*' is calles wildcard (only the classes you need)
 */

import java.util.*;

public class Import {
  public static void main(String[] args) {
    System.out.println(new Random().nextInt(10) + 1);
  }
}
