// References

/*
 *  A reference type refers to an object. Unlike primitive types that hold their
 *  values in the memory where the variable is allocated, referece types point
 *  to an object by storing the memory address where the object is located
 */

public class References {
  public static void main(String[] args) {
    int num = 3; // Holds '3' - memory

    String str1 = "Andre"; // pool of strings
    String str2 = "Andre";
    String str3 = new String("Abdul"); // unique object

    str1 = null;
    System.out.println(str1);
  }
}
