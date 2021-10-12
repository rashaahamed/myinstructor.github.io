// Checking if a number is even or odd

public class Math_02 {
  public static void main(String[] args) {
    // Modulus operator %
    // Returns the remainder

    // true or false -> boolean

    int num = 16;
    int zero = 0;

    // The comparison operator (==) returns a boolean (true or false)
    if (num % 2 == 0) {
      System.out.println(num + " is a even number");
    } else {
      System.out.println(num + " is an odd number");
    }

    // With some validation
    if (zero > 0) {
      if (zero % 2 == 0) {
        System.out.println(zero + " is a even number");
      } else {
        System.out.println(num + " is an odd number");
      }
    } else {
      System.out.println("Please, enter a number greater than 0");
    }
  }
}
