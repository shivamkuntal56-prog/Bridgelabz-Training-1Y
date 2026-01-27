import java.util.Scanner;

class SumNegative{
	public static void main (String args[]){
		double total = 0.0;
		Scanner input = new Scanner(System.in);
		
		while (true){
		System.out.println("enter a number ");
		double number = input.nextDouble();
		
		if(number<=0){
			break;
		}
		total = total+number;
		}
		System.out.println("total sum : "+total);
	}
}