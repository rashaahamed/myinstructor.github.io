// Increment

public class Increment {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;

    System.out.println("x: " + x++);
    System.out.println("x: " + x++);
    System.out.println("x: " + x);

    System.out.println("y: " + ++y);

    int z = 1;
    int w = 5 + z++;
    z++;

    // if (something is true) {
    //  num++;
    // }
    // System.out.println(num);

    System.out.println(w);
    System.out.println(z++);
    System.out.println(z);
  }
}
