// Creating methods

public class Methods {
  double result; // 0.0

  public double convert(int celsius) {
    this.result = celsius * 1.8 + 32;
    return result;
  }

  public void print(int celsius, double fahrenheit) {
    String formatted = String.format("%.2f", fahrenheit);
    System.out.println(celsius + "\u00B0C = " + formatted + "\u00B0F");
  }

  public static void main(String[] args) {
    int celsius = 17;
    Methods m = new Methods();
    m.print(celsius, m.convert(celsius));
  }
}
