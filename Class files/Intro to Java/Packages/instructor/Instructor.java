// Instructor

package instructor;

import employee.*;

public class Instructor extends Employee {
  public static void main(String[] args) {
    Instructor i = new Instructor();
    i.setCourse("Intro to Java programming");
    i.printCourse();
  }
}
