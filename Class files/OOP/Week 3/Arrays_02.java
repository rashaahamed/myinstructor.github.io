// Arrays

public class Arrays_02 {
  public static void main(String[] args) {
    int[] a1 = {1, 2, 3, 4, 5, 6};
    String[] a2 = {"Banana", "Strawberry", "Watermelon"};

    for (int i = 0; i < a1.length; i++) {
      System.out.println(a1[i] + " ");
    }
    System.out.println();

    // Enhanced for (aka for each)
    for (String name : a2) {
      System.out.println(name);
    }
  }
}
