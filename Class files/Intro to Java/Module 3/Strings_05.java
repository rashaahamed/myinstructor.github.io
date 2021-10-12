// String class and its methods

public class Strings {
  public static void main(String[] args) {
    String city = "Winnipeg";

    System.out.println(city.equals("WINNIPEG"));
    System.out.println(city.equalsIgnoreCase("winnipeg"));

    System.out.println(city.indexOf('n'));
    System.out.println(city.indexOf("nn"));

    // This method return -1 when no match is found
    System.out.println(city.indexOf('a'));

    System.out.println(city.charAt(5));
  }
}
