package Encapsulation.Question_1;

public class Runner {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(101,"rahul",50000);
        e1.assignDepartment("cs");
        e1.CalculateSalary();

        System.out.println("full-time Employee");
        e1.displayDetail();
        e1.getDepartmentDetails();

        System.out.println("----------------------------");

        PartTimeEmployee e2 = new PartTimeEmployee(102,"amit",5,5000);
        e2.assignDepartment("cs");
        e2.CalculateSalary();
        System.out.println("Part-time Employee");
        e2.displayDetail();
        e2.getDepartmentDetails();
    }
}
