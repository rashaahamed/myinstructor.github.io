// Polymorphism

/*
 *  Even though Feline is used, the JVM decides at runtime which method to call
 *  based on the type of the object assigned, not the variable's reference type
 *  This is called virtual method invocation, a fancy name for overriding
 */

class Feline {
  public void name() { System.out.println("Feline"); }
}

class Tiger extends Feline {
  public void name() { System.out.println("Tiger"); }
}

class Lion extends Feline {
  public void name() { System.out.println("Lion"); }
}

class Cat extends Feline {
  public void name() { System.out.println("Cat"); }
}

public class Polymorphism {
  public static void main(String[] args) {
    Feline[] felines = new Feline[3];
    felines[0] = new Tiger();
    felines[1] = new Lion();
    felines[2] = new Cat();

    for (int i = 0; i < felines.length; i++) {
      felines[i].name();
    }

    for (int i = 0; i < felines.length; i++) {
      System.out.println(felines[i] instanceof Feline);
    }

    System.out.println(felines instanceof Object);
    System.out.println(felines[0] instanceof Object);
  }
}
