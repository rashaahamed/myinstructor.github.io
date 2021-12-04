// Reading user imputs
// The '*' means that your are importing everything (classes and interfaces)
// your program needs
import java.util.*;

public class Inputs {
  public static void main(String[] main) {
    String name = ""; // by default, strings are null
    int age = 0;

    // We need an object of the Scanner class to read inputs
    Scanner scan = new Scanner(System.in);
    System.out.print("Please, enter your name: ");
    name = scan.nextLine();

    System.out.print("Please, enter your age: ");
    age = scan.nextInt();

    System.out.println("Welcome, " + name + ". You are " + age + " years old");

    scan.close();
  }
}
