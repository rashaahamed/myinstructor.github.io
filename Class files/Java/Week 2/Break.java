// Flow control - break

/*
 * 'break' is a statement that causes the control flow to exit the loop
 * structure and returns control to the enclosing statement
 */

public class Break {
  public static void main(String[] main) {
    int[] nums = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 3) {
        System.out.println(nums[i]);
        break; // stops the 'for' loop
      }
    }
  }
}
