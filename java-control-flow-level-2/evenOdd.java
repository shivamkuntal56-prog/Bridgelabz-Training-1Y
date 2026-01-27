import java.util.Scanner;

class EvenOdd {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number<=0) {  
            System.out.println("enter a natural number");
        } 
        else {
            for(int i =1;i<=number;i++){
				if(i%2==0){
					System.out.println("even numbers are : "+i);
				}
				else{
					System.out.println("odd numbers are : "+i);
				}
			}
        }
    }
}