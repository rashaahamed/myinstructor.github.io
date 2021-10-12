// Classes and objects

/*
 * A class is an abstract blueprint used to create more specific, concrete
 * objects. Classes often represent broad categories, like Car or Dog that
 * share attributes
 */

import java.util.*;
import static java.lang.System.*;

public class Classes {
  public static void main(String[] args) {
    String name = new String("John Smith");
    out.println(name);
    out.println(name.toUpperCase());
    out.println(name.length() + " characters");

    Random rand = new Random();
    out.println(rand.nextInt(9) + 1);
    out.println(rand.nextDouble()); // from 0.0 to 0.9999999999999
    out.println(String.format("%.2f", rand.nextDouble()));
  }
}
