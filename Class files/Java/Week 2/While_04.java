// The do-while loop

public class While_04 {
  public static void main(String[] main) {
    boolean keepGoing = true;
    int result = 14;
    int i = 10;

    do {
      i--;
      if (i == 8)
        keepGoing = false;
        result = result - 2;
    } while (keepGoing);

    System.out.println(result);  // 10
  }
}
