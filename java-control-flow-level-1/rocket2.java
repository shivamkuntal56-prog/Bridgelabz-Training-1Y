import java.util.Scanner;

class Rocket{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter countdown number : ");
		int number = input.nextInt();
		
		for(;number>=1;number--){
			System.out.println(number);
		}
	}
}