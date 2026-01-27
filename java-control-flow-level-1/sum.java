import java.util.Scanner;

class Sum{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		System.out.println("enter a number : ");
		double number = input.nextDouble();
		while(number!=0){
			total=total+number;

			System.out.print("Enter a number : ");
            number = input.nextDouble();
		}
		System.out.println("Total sum = " + total);
	}
}