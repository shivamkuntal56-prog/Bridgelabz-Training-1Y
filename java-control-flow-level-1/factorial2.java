import java.util.Scanner;

class Factorial{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int fact = 1;
		System.out.println("enter positive number : ");
		int number = input.nextInt();
		
		if(number<0){
			System.out.println("pls enter positive integer");
		}
		else{
			for(int i=1;i<=number;i++){
				fact=fact*i;
			}
			System.out.println("factorial is : "+fact);
		}
	}
}