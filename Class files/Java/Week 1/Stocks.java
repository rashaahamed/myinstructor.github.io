// Exercise: stocks

public class Stocks {
  public static void main(String[] main) {
    int shares = 300;
    double stockPrice = 21.75;
    double commission = .02;

    double totalStockPrice = shares * stockPrice;
    double totalCommission = totalStockPrice * commission;
    double totalPaid = totalStockPrice + totalCommission;

    System.out.println("Stocks: $" + totalStockPrice);
    System.out.println("Commission: $" + totalCommission);
    System.out.println("Total: $" + totalCommission);
  }
}
