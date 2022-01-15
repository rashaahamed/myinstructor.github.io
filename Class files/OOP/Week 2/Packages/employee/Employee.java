// Employee
// PIC (package, imports, class)

package employee;

import static java.lang.System.*;

public class Employee {
  private String type;

  // Access modifiers
  // [empty]: package-private (aka 'default')
  // private
  // protected (private + inheritance)
  // public

  protected void setType(String type) {
    this.type = type;
  }

  protected void printEmp() {
    out.println("You were hired as a " + this.type);
  }
}
