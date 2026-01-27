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
            int counter=1;
			while(counter<number){
				if(number%counter==0){
					System.out.println(counter);
				}
				counter++;
			}
        }
    }
}