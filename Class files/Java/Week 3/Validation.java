// SIN (number) validation

// Methods are basically blocks of code you can reuse
// The process of validate inputs depends on the project requirements

public class Validation {
  public static boolean validate(String str) {
    char[] chars = str.toCharArray();
    boolean isValid = true;

    for (char c : chars) {
      if (!Character.isDigit(c)) {
        isValid = false;
      }
    }
    return isValid; // true or false
  }

  public static void main(String[] main) {
    String sin = " 333666999 ";
    sin = sin.trim();

    if (!sin.isBlank() && sin.length() == 9) {
      if (validate(sin)) {
        System.out.println("Your SIN is valid");
      } else {
        System.out.println("Your SIN contains invalid characters");
      }
    } else {
      System.out.println("Please enter a valid 9-digit SIN");
    }
  }
}
