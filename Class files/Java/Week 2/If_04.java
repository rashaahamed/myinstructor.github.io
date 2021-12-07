// Logical operators - AND (&&) OR ||

public class If_04 {
  public static void main(String[] main) {
    int x = 5;
    int y = 8;

    if (x > 0 && y > 0) {
      System.out.println("Yay 1");
    } else {
      System.out.println("Nay 1");
    }

    if (x > 0 || y > 10) {
      System.out.println("Yay 2");
    } else {
      System.out.println("Nay 2");
    }

    if (x > 0 || ++y == 9) {
      System.out.println("Yay 3");
    } else {
      System.out.println("Nay 3");
    }

    System.out.println("x = " + x + " | y = " + y);
  }
}
