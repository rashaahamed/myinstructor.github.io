// Instance variables x local variables

public class InstanceVariables {
  // Instance variables
  // Instance variables have default values
  String company;    // null
  int num;           // 0
  double area;       // 0.0
  boolean valid;     // false

  public static void main(String[] args) {
    // Local variables must be initialized before use
    String name = "John";
    int num = 0;
    int count = 0;

    System.out.println(name);

    InstanceVariables iv = new InstanceVariables();
    iv.company = "Microsoft";
    System.out.println(iv.company);
  }
}
