// The modulus operator

public class Modulus {
  public static void main(String[] main) {
     int rem = 16 % 5; // The remainder is 1
     System.out.println(rem);

     int num = 4;
     if (num % 2 == 0) {
       System.out.println(num + " is even");
     } else {
       System.out.println(num + " is odd");
     }

     boolean valid = true;
     if (valid) {
       System.out.println("Valid");
     } else {
       System.out.println("Not valid");
     }
  }
}
