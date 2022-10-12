import java.util.Scanner;

public class Main {
  public static Scanner sc = new Scanner(System.in);
  public static Main main = new Main();
  public static int productChoice;
  public static int discountNumber;
  private int price;
  private double discount;

  public static void main(String[] args) {
    runCode();
  }

  public static void runCode() {
    displayItems();
    displayDiscount();
    computeBill(main.getPrice(), main.getDiscount());
  }

  public static void displayItems() {
    System.out.println("Iphone products: ");
    System.out.println("1) Iphone 11 --> 34,490");
    System.out.println("2) Iphone 12 --> 44,990");
    System.out.println("3) Iphone 13 --> 52,440");
    System.out.print("Enter product number: ");
    productChoice = sc.nextInt();
    switch (productChoice) {
      case 1:
        main.setPrice(34490);
        break;
      case 2:
        main.setPrice(44990);
        break;
      case 3:
        main.setPrice(52440);
        break;
    }
  }

  public static void displayDiscount() {
    System.out.println("Discounts: ");
    System.out.println("1) DSC00 --> 0%");
    System.out.println("2) DSC01 --> 10%");
    System.out.println("3) DSC02 --> 20%");
    System.out.println("4) DSC03 --> 30%");
    System.out.print("Enter discount number: ");
    discountNumber = sc.nextInt();
    getDiscountChoice(discountNumber);
  }

  public static int getDiscountChoice(int discountInput) {
    switch (discountInput) {
      case 1:
        main.setDiscount(0.0);
        break;
      case 2:
        main.setDiscount(0.10);
        break;
      case 3:
        main.setDiscount(0.20);
        break;
      case 4:
        main.setDiscount(0.30);
        break;
    }
    return discountInput;
  }

  public double getDiscount() {
    return this.discount;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int amount) {
    this.price += amount;
  }

  public void setDiscount(double amount) {
    this.discount += amount;
  }

  public static void computeBill(int price, double discount) {
    double discounted = price * discount;
    double totalBill = price - discounted;
    if (discount == 0) {
      System.out.println("Your total bill is Php " + price);
    } else {
      System.out.println("Your total bill is Php " + (int) Math.round(totalBill));
    }
  }

}