// Reading inputs

/*
 * The Scanner class has methods for reading strings, bytes, integers, long,
 * short integers, floats, and doubles
 */

import java.util.*;

public class Inputs {
  String name;
  int age;

  public static void main(String[] args) {
    Inputs inputs = new Inputs();  // non-arg constructor
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    inputs.name = scan.nextLine();

    System.out.print("Enter your age: ");
    inputs.age = scan.nextInt();

    scan.close();
  }
}
