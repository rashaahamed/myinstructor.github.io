// The swicht-case statement

/*
 * The 'swicht' statement is a complex decision-making strucutre in which a
 * single value is evaluated and flow is redirected to the first matching
 * branch, known as a 'case' statement
 */

public class Switch_01 {
  public static void main(String[] main) {
    String hero = "Batman";

    switch(hero) {
      case "Spider-man":
        System.out.println("Spider");
        break;
      case "Batman":
        System.out.println("Bat");
        break;
      case "Superman":
        System.out.println("Krypton");
    }
  }
}
