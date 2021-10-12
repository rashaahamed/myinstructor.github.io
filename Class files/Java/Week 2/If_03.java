//  The 'if-else' statement

public class If_03 {
  public static void main(String[] main) {
    boolean ready1 = true;
    boolean ready2 = false;
    boolean flag = true;

    if (ready1) {
      System.out.println("You are ready");
    } else {
      System.out.println("You are not ready");
    }

    // The && AND operator - both must be true
    if (ready1 && ready2) {
      System.out.println("All good");
    } else {
      System.out.println("Not that good");
    }

    // The || OR operator - only one must be true
    if (ready1 || ready2) {
      System.out.println("All good");
    } else {
      System.out.println("Not that good");
    }

    if (flag = false) {
      System.out.println("If (true)");
    } else {
      System.out.println("Else (false)");
    }
  }
}
