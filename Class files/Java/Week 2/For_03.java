// Nested for loops

public class For_03 {
  public static void main(String[] main) {
    // 2D array - multidimensional array
    int[][] grid = {
      {11, 12, 13, 14},
      {21, 22, 23, 24},
      {31, 32, 33, 34},
      {41, 42, 43, 44}
    };

    System.out.println(grid.length);
    int len = grid.length;

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        System.out.print(grid[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
