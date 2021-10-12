// The switch statement

/*
 * The 'switch' statement is a complex decision-making structure in which a
 * single value is evaluated and flow is redirected to the first matching branch,
 * known as a 'case' statement
 */

public class Switch {
  public static void main(String[] args) {
    int num = 5;

    switch(num) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      default:
        System.out.println("Any other number");
    }
  }
}
