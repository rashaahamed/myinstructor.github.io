// Classes and objects

/*
 * An object is an abstract data type created by a developer. It can include
 * multiple preoperties and methods and may even contain other objects
 */

// Classes in 'java.lang' are available by default
import java.util.*;
// Importing the static members of the System class
import static java.lang.System.*;

public class Classes {
  public static void main(String[] args) {
    String name = new String("John");
    out.println(name);
    out.println(name.toUpperCase());
    out.println(name.length());
    out.println(name); // John

    Random rand = new Random();
    out.println(rand.nextInt(10));
    out.println(rand.nextDouble()); // 0.0 to 0.9999999999999
    out.println(String.format("%.2f", rand.nextDouble()));

  }
}
