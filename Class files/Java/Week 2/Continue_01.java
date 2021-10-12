// Flow control - continue

/*
 * 'continue' is a statement that causes the flow to stop the execution of
 * the current iteration and go on to the next, preventing any other instruction
 * from being executed
 */

public class Continue_01 {
  public static void main(String[] main) {
    int[] nums = {1, 2, 3, 4, 5, 6};
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        count++;
        continue;
      }
    }
    System.out.println(count);
  }
}
