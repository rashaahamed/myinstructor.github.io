// Flow control (continue)

/*
 * 'continue' is a statement that causes the flow to stop the execution of the
 * current iteration and go to the next, preventing any other instruction from
 * being executed
 */

public class Continue {
  public static void main(String[] args) {
    int[] nums = {0, 1, 2, 3, 4, 5};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0)
        continue;
        System.out.println(nums[i]);
    }
  }
}
