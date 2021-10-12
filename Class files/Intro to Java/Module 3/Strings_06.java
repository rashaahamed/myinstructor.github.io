// String class and its methods

public class Strings {
  public static void main(String[] args) {
    String course = "Java programming";

    System.out.println(course.substring(0, 4));
    System.out.println(course.substring(5));

    // This will return an empty string
    System.out.println(course.substring(6, 6));
  }
}
