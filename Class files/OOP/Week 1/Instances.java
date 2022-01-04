// instances and References

public class Instances {
  // These are instance variables (aka fields)
  // IV have default values
  String company;  // null
  int id;          // 0
  boolean valid;   // false

  public static void main(String[] args) {
    String name = "Andre";
    int num = 17;
    int count = 5;

    Instances inst1 = new Instances();
    inst1.company = "Microsoft";
    inst1.id = 1001;
    inst1.valid = true;
    System.out.println(inst1.company);
    System.out.println(inst1.id);
    System.out.println(inst1.valid);

    Instances inst2 = new Instances();
    inst2.company = "Samsung";
    inst2.id = 1007;
    inst2.valid = false;
    System.out.println(inst2.company);
    System.out.println(inst2.id);
    System.out.println(inst2.valid);

    Instances inst3 = inst2;
    System.out.println(inst3.company);
    System.out.println(inst3.id);
    System.out.println(inst3.valid);

    inst3.company = "Apple";
    System.out.println(inst2.company);
    System.out.println(inst3.company);
  }
}
