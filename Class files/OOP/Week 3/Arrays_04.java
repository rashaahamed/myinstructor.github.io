// Asymetric multidimensional arrays

public class Arrays_04 {
  public static void main(String[] args) {
    int[][] asymetric = {{1, 2}, {4}, {7, 8, 9}};
    System.out.println(asymetric.length + " elements (arrays)");

    // Nested for loop
    for (int i = 0; i < asymetric.length; i++) {
      for (int j = 0; j < asymetric[i].length; j++) {
        System.out.print(asymetric[i][j] + " | ");
      }
      System.out.println();
    }
  }
}
