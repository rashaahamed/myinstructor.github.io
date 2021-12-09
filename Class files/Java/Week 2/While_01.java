// The while loop

/*
   A repetition control structure, which we refer as a loop, executes
   a block of code multiple times in succession

   While loop -> a Boolean expression and a block of code
*/

public class While_01 {
  public static void main(String[] main) {
    int x = 5;

    // No truthy and falsy values here. Only Boolean expression
    while (x > 0) {
      System.out.println("Hello");
      x--;
    }
  }
}
