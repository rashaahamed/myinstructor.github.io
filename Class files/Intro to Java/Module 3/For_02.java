// The enhanced for (aka for-each)

/*
 * The enhnaced for loop is designed to iterate once for every element in an
 * array. Each time the loop iterates, it copies an array element to a variable
 *
 * for (type elementVar : array)
 *     my code
 */

public class For {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "Larry";
    names[1] = "Harry";
    names[2] = "Jerry";

    for (String name : names)
      System.out.println(name);
  }
}
