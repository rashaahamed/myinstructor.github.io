// The switch-case statement

/*
 * The 'switch' statement is a complex decision-making structure in which
 * a single value is evaluated and flow is redirected to the first matching
 * branch, known as a 'case' statement
 */

public class Switch_01 {
  public static void main(String[] main) {
    String hero = "Batman";

    switch(hero) {
      case "Spider-Man":
        System.out.println("Lives in Manhattan");
        break;
      case "Superman":
        System.out.println("Lives in Metropolis");
        break;
      case "Batman":
        System.out.println("Lives in Gotham City");
        break;
      default:
        System.out.println("Unknown city");
    }

    System.out.println();
  }
}
