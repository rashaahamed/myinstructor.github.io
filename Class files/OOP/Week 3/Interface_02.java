// Interfaces

interface Processable {
  void process();
}

interface Iteratable {
  void iterate();
}

public class Interface_02 implements Processable, Iteratable {
  @Override public void process() {
    System.out.println("Process");
  }

  @Override public void iterate() {
    System.out.println("Iterate");
  }

  public static void main(String[] args) {
    Interface_02 itc = new Interface_02();
    itc.process();
    itc.iterate();
  }
}
