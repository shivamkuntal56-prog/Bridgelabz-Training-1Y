import java.util.Scanner;

class Profit
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter unit price:");
    double unitPrice = input.nextDouble();

    System.out.println("Enter quantity:");
    int quantity = input.nextInt();

    double total_price = unitPrice*quantity;

    System.out.println("total price: " +total_price);
  }
}