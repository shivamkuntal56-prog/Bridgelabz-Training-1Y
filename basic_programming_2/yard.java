import java.util.Scanner;

class Yard
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter distance in feet :");
		double distance = input.nextDouble();
		
		double inMiles = distance*1760*3;
		double inYards = distance*3;
		
		System.out.println("your distance in yards is :"+inYards
		                    +"while in feet is :"+distance 
							+ "and miles is:"+inMiles);
	}
}