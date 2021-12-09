// The 'for' statement (loop)

/*
  for (initialization; booleanExpression; updateStatement) {
    code here...
  }
*/

public class For_01 {
  public static void main(String[] main) {
    // An array of integers - a group/list of elements of the same type
    // An index-based data structure
    // Indexes -> 0  1  2  3  4  5
    // Length -> 6 elements/items

    int[] nums = {1, 2, 3, 4, 5, 6};

    // [i] is called subscript
    System.out.println(nums[0]);
    System.out.println(nums[nums.length - 1]);

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
