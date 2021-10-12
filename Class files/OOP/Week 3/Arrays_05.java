// Tridimensional array
// The first index (3) is the length of the array

public class Arrays_05 {
  public static void main(String[] args) {
    int[][][] a = new int[3][4][5];
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          a[i][j][k] = i + j + k;
          count++;
        }
      }
    }

    // Nested enhanced for (for-each)
    for (int[][] arr1 : a) {
      for (int[] arr2 : arr1) {
        for (int item : arr2) {
          System.out.print(item + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
