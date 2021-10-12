// Flow control (break)

public class Break {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 3) {
        System.out.println(nums[i]);
        break;
      }
    }
  }
}
