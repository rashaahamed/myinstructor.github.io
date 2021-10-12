// Exercise: converter

/*
 * Write a program that converts Celsius to Fahrenheit and Fahrenheit to
 * Celsius
 */

public class Stocks {
  public static void main(String[] main) {
    double c = 15.50;
    double f = 73.40;

    double toFahrenheit = c * 1.8 + 32;
    double toCelsius = (f - 32) * 5 / 9;

    System.out.println(toFahrenheit);
    System.out.println(toCelsius);
  }
}
