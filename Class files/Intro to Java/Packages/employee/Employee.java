// Employee

// PIC (package, imports, class)

package employee;

public class Employee {
  // package-private
  String course;

  protected void setCourse(String course) {
    this.course = course;
  }

  protected void printCourse() {
    System.out.println("Your current course is " + this.course);
  }
}
