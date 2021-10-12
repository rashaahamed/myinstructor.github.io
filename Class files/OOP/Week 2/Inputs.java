// Reading user's inputs

import java.util.*;

public class Inputs {
  String name;
  int id;

  public static void main(String[] args) {
    Inputs in = new Inputs();
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    in.name = scan.nextLine();

    System.out.print("Enter your ID: ");
    in.id = scan.nextInt();

    scan.close();
  }
}
