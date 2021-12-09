// The while loop

public class While_01 {
  public static void main(String[] main) {
    int x = 5;
    boolean valid = true;

    while (valid) {
      System.out.println(x);
      if (x == 3) valid = false;
      x--;
    }
  }
}
