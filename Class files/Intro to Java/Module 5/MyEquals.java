// Overriding equals()

public class MyEquals {
  String name;

  MyEquals(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj != null && obj instanceof MyEquals) {
      MyEquals otherObj = (MyEquals) obj;
      return this.name == otherObj.name;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    MyEquals me1 = new MyEquals("Andre");
    MyEquals me2 = new MyEquals("Andre");
    MyEquals me3 = new MyEquals("Steve");

    System.out.println(me1.equals(me2));
    System.out.println(me1.equals(me3));
  }
}
