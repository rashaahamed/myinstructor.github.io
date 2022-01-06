// Constructors

/*
 * There are two key points to note about constructors: the name of the
 * constructor matches the name of the class, and there's no return type
 */

class Movie {
  String title;
  int year;

  // Since a constructor is coded, a default constructor isn't supplied
  // The method/constructor contains 2 parameters
  public Movie(String title, int year) {
    this.title = title;
    this.year = year;
  }

  // My own "default" constructor
  public Movie() { }

  public void printData() {
    System.out.println(this.title + " was released in " + this.year);
  }

  @Override
  public String toString() {
    return this.title + ", " + this.year;
  }
}

public class Constructors {
  public static void main(String[] args) {
    // Passing two arguments to 'new Movie()'
    Movie movie1 = new Movie("Terminator 2", 1991);
    movie1.printData();

    Movie movie2 = new Movie();
    movie2.title = "Forrest Gump";
    movie2.year = 1994;
    movie2.printData();

    System.out.println(movie1);
  }
}
