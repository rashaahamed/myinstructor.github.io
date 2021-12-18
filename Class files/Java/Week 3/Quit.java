// Press 'q' to quit

import java.util.*;

public class Quit {
  public static void main(String[] main) {
    String movie = "";
    int count = 1;

    // Loop
    do {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter movie number " + count + ": ");
      movie = scan.nextLine();
      count++;
    } while (!movie.equals("q"));
  }
}
