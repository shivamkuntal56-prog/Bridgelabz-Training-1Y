import java.util.Scanner;

class Factor {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number < 0) {  
            System.out.println("enter a positive number");
        } 
        else {
            for(int i =1;i<number;i++){
				if(number%i==0){
					System.out.println(i);
				}
			}
        }
    }
}