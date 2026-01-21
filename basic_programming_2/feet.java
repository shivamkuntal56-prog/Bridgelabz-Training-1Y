import java.util.Scanner;

class Feet
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter height :");
		double height = input.nextDouble();
		
		double inCM = height*30.48;
		double inInches = height*12;
		
		System.out.println("your height in cm is :"+inCM 
		                    +"while in feet is :"+height 
							+ "and inches is:"+inInches);
	}
}