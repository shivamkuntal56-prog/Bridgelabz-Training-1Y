import java.util.Scanner;

class Bounces {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a salary :");
        int salary = input.nextInt();
		
		System.out.println("Enter a year of service :");
        int service = input.nextInt();

        if (service>5) {  
		   int bouns = salary*5/100;
		   int totalSalary = salary+bouns;
            System.out.println("your total salary : "+totalSalary);
        } 
        else {
			 System.out.println("your service are less!");
				}
    }
}