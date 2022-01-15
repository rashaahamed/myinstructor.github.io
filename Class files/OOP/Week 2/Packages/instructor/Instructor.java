// Instructor

package instructor;

import employee.*;

public class Instructor extends Employee {
  public static void main(String[] args) {
    Instructor inst = new Instructor();
    inst.setType("Instructor");
    inst.printEmp();
  }
}

// Step 1: javac employee/Employee.java instructor/Instructor.java
// Step 2: java instructor.Instructor
