// Employee

package employee;

public class Employee {
  private String course;

  protected void setCourse(String course) {
    this.course = course;
  }

  protected void printCourse() {
    System.out.println("Your current course is " + this.course);
  }
}
