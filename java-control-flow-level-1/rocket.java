import java.util.Scanner;

class Rocket{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter countdown number :");
		int number = input.nextInt();
		
		while(number>=1){
			System.out.println(number);
			number--;
		}
	}
}