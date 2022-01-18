// Arrays

public class Arrays_03 {
  public static void main(String... args) {
    int[][] asymetric = {
      {1, 2},
      {4},
      {6, 7, 8}
    };

    System.out.println(asymetric.length + "\n");

    for (int i = 0; i < asymetric.length; i++) {
      for (int j = 0; j < asymetric[i].length; j++) {
        System.out.print(asymetric[i][j] + " | ");
      }
      System.out.println();
    }
  }
}
