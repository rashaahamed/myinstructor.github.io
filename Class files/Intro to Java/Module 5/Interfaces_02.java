// Interfaces

interface Processable {
  void process();
}

interface Iteratable {
  void iterate();
}

class MyClass implements Processable, Iteratable {
  @Override
  public void process() {
    System.out.println("Process");
  }

  @Override
  public void iterate() {
    System.out.println("Iterate");
  }

  public static void main(String[] args) {
    MyClass mc = new MyClass();
    mc.process();
    mc.iterate();
  }
}
