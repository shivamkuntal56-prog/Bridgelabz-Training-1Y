import java.util.Scanner;

class Kilometer
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);

    System.out.println("Enter distance(km):");
    double distance = input.nextDouble();
	
	double miles = distance*1.6;
  System.out.println("convert in miles :"+miles);
  }
}