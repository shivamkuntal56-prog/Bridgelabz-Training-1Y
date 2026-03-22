package Encapsulation.Question_1;

public class PartTimeEmployee extends Employee implements Department {

    private int workedHour;
    private int rate;
    String department;

    public PartTimeEmployee(int EmployeeId, String Name,int workedHour,int rate) {
        super(EmployeeId,Name,0);
        this.workedHour=workedHour;
        this.rate=rate;
        this.Salary = CalculateSalary();
    }
    @Override
    public double CalculateSalary() {
        return workedHour*rate ;
    }
    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }
    @Override
    public void getDepartmentDetails() {
        System.out.println("Department : "+department);
    }
    public void printInfo_partTime(){
        System.out.println("Department : "+department);
    }
}
