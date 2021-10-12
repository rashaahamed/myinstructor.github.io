// The conditional operator (aka ternary operator)

public class IfStatement {
  public static void main(String[] args) {
    int hour = 11;

    String time = (hour < 12) ? "Morning" : "Afternoon";
    System.out.println(time);
  }
}
