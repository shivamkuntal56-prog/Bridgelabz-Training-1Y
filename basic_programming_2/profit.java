import java.util.Scanner;

class Profit
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter selling price:");
    int sellingPrice = input.nextInt();

    System.out.println("Enter cost price:");
    int costPrice = input.nextInt();

    int profit = sellingPrice - costPrice;
	double profit_per = (profit*100)/costPrice;

    System.out.println("Age of Harry: " +profit);
	System.out.println("Age of Harry: " +profit_per);
  }
}
