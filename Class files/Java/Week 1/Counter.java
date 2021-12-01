// The increment operator (post-unary)

public class Count {
  public static void main(String[] main) {
    int count = 0;

    for (int i = 0; i < 5; i++) {
      count++;
      // count = count + 1;
      // count += 1; (shorthand for the line above)
    }

    System.out.println(count);
  }
}
