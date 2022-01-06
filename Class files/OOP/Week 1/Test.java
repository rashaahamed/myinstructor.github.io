// Classes and objects

class Movie {
  String title;
  int year;

  public void printData() {
    System.out.println(this.title + " was released in " + this.year);
  }

  public void printMessage() {
    System.out.println("Hello, friend");
  }
}

public class Test {
  public static void main(String[] args) {
    Movie movie1 = new Movie();
    movie1.title = "The lion king";
    movie1.year = 1994;
    movie1.printData();

    Movie movie2 = new Movie();
    movie2.title = "The Matrix";
    movie2.year = 1999;
    movie2.printData();

    new Movie().printMessage();
  }
}
