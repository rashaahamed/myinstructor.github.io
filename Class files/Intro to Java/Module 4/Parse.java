// Parse numbers using the Scanner class

import java.util.*;

public class Parse {
  public static void main(String[] args) {
    System.out.println(new Scanner("16").nextByte());
    System.out.println(new Scanner("34").nextInt());
    System.out.println(new Scanner("73489734534").nextLong());
    System.out.println(new Scanner("4.3").nextFloat());
    System.out.println(new Scanner("8.99").nextDouble());
    System.out.println(new Scanner("true").nextBoolean());
  }
}
