// Press 'q' to quit

import java.util.*;

public class Quit {
  public static void main(String[] main) {
    // Local variables must be initialized
    String fruit = "";
    int count = 1;

    do {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your favourite fruit (" + count +"): ");
      fruit = scan.nextLine();
      count++;
    } while(!fruit.equals("q"));
  }
}
