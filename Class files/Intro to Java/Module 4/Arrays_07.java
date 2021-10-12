// 3D Array

import java.util.*;

public class Arrays_07 {
  public static void main(String[] args) {
    int[][][] a = new int[3][4][5];
    int count = 0;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        for (int k = 0; k < a[i][j].length; k++) {
          a[i][j][k] = i + j + k;
          count++;
          System.out.println(a[i][j][k]);
        }
      }
    }
    System.out.println(count);
  }
}
