// The if-else statement

// The if-else statement will execute one group of statements if its boolean
// expression is true

public class If_01 {
  public static void main(String[] main) {
    int hour = 10;
    int count = 1;

    // An 'if' requires a boolean expression, or a boolean value
    if (hour > 12) {
      System.out.println("Good afternoon");
      System.out.println(++count);
    } else {
      System.out.println("Good morning");
      System.out.println(++count);
    }

    int num = 9;

    if (num > 5) {
      System.out.println("Awesome");
    } else if (num > 0 && num < 5) {
      System.out.println("Cool");
    } else {
      System.out.println("Okay");
    }
  }
}
