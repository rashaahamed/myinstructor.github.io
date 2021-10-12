// Do-While statement

public class DoWhile {
  public static void main(String[] args) {
    boolean keepGoing = true;
    int result = 14, i = 10;

    do {
      i--;
      if (i == 8)
        keepGoing = false;
        result -= 2; // result = result - 2
    } while (keepGoing);

    System.out.println(result);  // 10
  }
}
