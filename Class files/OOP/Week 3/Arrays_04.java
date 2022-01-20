// Arrays

import java.util.*;
import static java.util.Arrays.*;

public class Arrays_04 {
  public static void main(String[] args) {
    int[] a = {4, 5, 1, 3, 2};
    int[] b = {2, 4, 1, 5, 3};
    int[] c = a;

    sort(a);
    sort(b);

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(c));

    System.out.println(a == b);      // false
    System.out.println(a.equals(b)); // false
    System.out.println(a == c);      // true
    System.out.println(a.equals(c)); // true
  }
}
