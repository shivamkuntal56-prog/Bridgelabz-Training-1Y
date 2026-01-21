import java.util.Scanner;

class Find_length
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter perimeter of squre : ");
	float perimeter = input.nextFloat();
	
	float side = perimeter/4;
	System.out.println("side of squre :"+side);
  }
}