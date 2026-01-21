import java.util.Scanner;

class Calculater
{
  public static void main(String args[])
  {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter first number :");
	float num1 = input.nextFloat();
	
	System.out.println("enter second number :");
	float num2 = input.nextFloat();
	
	double addition = num1+num2;
	double subtraction = num1-num2;
	double multiplication = num1*num2;
	double division = num1/num2;
	
	System.out.println("addition of two number :"+addition);
	System.out.println("subtraction of two number :"+subtraction);
	System.out.println("multiplication of two number :"+multiplication);
	System.out.println("division of two number :"+division);
  }
}