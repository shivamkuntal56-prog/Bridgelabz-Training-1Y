import java.util.Scanner;

class SumCompareNatural{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("enter number : ");
		int number = input.nextInt();
		
		if(number<=0){
			System.out.println("enter a natural number");
		}
		else{
			int i = 1;
		    while(i<=number){
			sum = sum+i;
			i++;
		 }
		 int formula = number*(number+1)/2;
		 if(formula==sum){
		 System.out.println("total sum : "+sum);
		}
		else{
			System.out.println("logic error.");
		}
		}
	}
}