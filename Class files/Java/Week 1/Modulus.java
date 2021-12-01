// The modulus operator

public class Modulus {
  public static void main(String[] main) {
    // % - return the remainder

    int rem = 16 % 5;  // 16 / 5 == 3 (1 is the remainder)
    System.out.println(rem);

    int rem2 = 100 % 10;
    System.out.println(rem2);  // 0 (no remainder)

    int num = 5;
    if (num % 2 == 0) {
      System.out.println(num + " is even");
    } else {
      System.out.println(num + " is odd");
    }

    boolean valid = true;
    if (valid = false) {
      System.out.println("Valid");
    } else {
      System.out.println("Invalid");
    }
  }
}
