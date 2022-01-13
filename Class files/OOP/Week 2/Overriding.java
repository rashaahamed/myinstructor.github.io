// Method overriding

/*
  A subclass/child class may have a method with the same signature as a
  superclass method.

  The @Override annotation denotes that the child class method overrides the
  base class method
*/

class Programmer {
  double salary;

  public void setPromo(double salary) {
    this.salary = salary + (salary * .10);
  }

  public double getPromo() {
    return this.salary;
  }
}

class Senior extends Programmer {
  @Override
  public void setPromo(double salary) {
    this.salary = salary + (salary * .20);
  }
}

public class Overriding {
  public static void main(String[] args) {
    Programmer prog = new Programmer();
    prog.setPromo(6000);
    System.out.println(prog.getPromo());

    Senior senior = new Senior();
    senior.setPromo(6000);
    System.out.println(senior.getPromo());
  }
}
