// Area

/*
 * Write a program that calculates the circumference of a circle based on the
 * radius entered by the user
 */

import java.util.*;
import java.lang.*;

public class Area {
  private double radius;

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    double area = Math.PI * (Math.pow(this.radius, 2));
    return area;
  }

  public static void main(String[] args) {
    double r = 0.0;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter radius in cm: ");
    r = scan.nextDouble();

    Area area = new Area();
    area.setRadius(r);

    System.out.printf("Area of the circumference is %.2f cm\n", area.getArea());
    scan.close();
  }
}
