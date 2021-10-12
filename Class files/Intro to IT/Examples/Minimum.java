// Find the minimum in a list of numbers
// Java

public class Minimum {
  public static void main(String[] args) {
    // Lenght == 5
    //             0  1   2   3  4
    int[] nums = {77, 2, 99, -1, 0};
    int min = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println(min);
  }
}
