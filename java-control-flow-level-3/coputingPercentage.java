import java.util.Scanner;

class ComputingPercentage {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks of physics : ");
        int phyMarks = input.nextInt();

        System.out.print("Enter marks of chemistry : ");
        int chemMarks = input.nextInt();
		
		System.out.print("Enter marks of math : ");
        int mathMarks = input.nextInt();
		
		double percentage = (phyMarks+chemMarks+mathMarks)/3;
		System.out.println("total percentage : " +percentage);

        if (percentage>=80) {
            System.out.println("your grade A");
			System.out.println("Remark : above agency-normalized standards");
        } 
		else if(percentage<80 && percentage>=70) {
            System.out.println("your grade B");
			System.out.println("Remark : at agency-normalized standards");
        }
		else if(percentage<70 && percentage>=60) {
            System.out.println("your grade C");
			System.out.println("Remark : below,but approaching agency-normalized standards");
        }
		else if(percentage<60 && percentage>=50) {
            System.out.println("your grade E");
			System.out.println("Remark : well below agency-normalized standards");
        }
		else if(percentage<50 && percentage>=40) {
            System.out.println("your grade F");
			System.out.println("Remark : too below agency-normalized standards");
        }
		else if(percentage<40) {
            System.out.println("your grade R");
			System.out.println("Remark : remedial standards");
        }
    }
}