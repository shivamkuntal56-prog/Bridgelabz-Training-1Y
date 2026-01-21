import java.util.Scanner;

class Triangle
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter height(cm) :");
	double height = input.nextDouble();
	
	System.out.println("enter base(cm) :");
	double base = input.nextDouble();
	
	double area = 0.5*base*height;
	double area_inInches = 0.393*area;
	
	System.out.println("area of triangle(cm): "+area);
	System.out.println("area of triangle(inches): "+area_inInches);
  }
}