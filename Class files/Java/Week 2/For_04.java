// For and enhanced for (aka foreach) with 3D arrays

public class For_04 {
  public static void main(String[] main) {
    // A 3D array
    int[][][] a = new int[3][4][4];

    // We need 3 for loops to manipulate our array
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          a[i][j][k] = i + j + k;
        }
      }
    }

    for (int[][] arr1 : a) {
      for (int[] arr2 : arr1) {
        for (int elem : arr2) {
          System.out.print(elem + "\t");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
