// The 'for' statement (for loop)

/*
 * for (initialization; booleanExpression; updateStatement) {
 *    statements;
 * }
 */

public class For_01 {
  public static void main(String[] main) {
    // An array of integers - a group, a list of elements of the same type

    // Indexes -> 0  1  2  3  4  5
    int[] nums = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
