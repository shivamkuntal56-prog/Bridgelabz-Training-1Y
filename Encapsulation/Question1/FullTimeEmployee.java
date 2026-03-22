package Encapsulation.Question_1;

public class  FullTimeEmployee extends Employee implements Department {

    String department;
    private double Salary1;

    public FullTimeEmployee(int EmployeeId, String Name, double Salary) {
        super(EmployeeId,Name,Salary);
        this.department = department;
        this.Salary1 = Salary1;
    }
    @Override
    public double CalculateSalary() {
        return Salary1;
    }
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public void getDepartmentDetails() {
        System.out.println("Department : "+department);
    }
    public void printInfo_fullTime(){
        System.out.println("Department : "+department);
    }
}
