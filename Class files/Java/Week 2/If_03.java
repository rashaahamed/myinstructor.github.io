// The conditional operator (aka ternary operator)

// The conditional operator provides a shorthand method of
// expressing a simple if-else statement

public class If_03 {
  public static void main(String[] main) {
    int hour = 11;

    System.out.println((hour > 12) ? "Morning" : "Afternoon");

    String periodOfDay = (hour > 10) ? "Morning" : "Afternoon";
    System.out.println(periodOfDay);
  }
}
