package Encapsulation.Question_1;

abstract class Employee {
    private int EmployeeId;
    private String Name;
    protected double Salary;

    public Employee(int EmployeeId,String Name,double Salary){
        this.EmployeeId = EmployeeId;
        this.Name = Name;
        this.Salary = Salary;
    }
    public int getEmployeeId(){
        return EmployeeId;
    }
    public void setEmployeeId(int EmployeeId){
        this.EmployeeId=EmployeeId;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double Salary){
        this.Salary = Salary;
    }
    public abstract double CalculateSalary();

    public void displayDetail(){
        System.out.println("Employee Id : "+EmployeeId);
        System.out.println("Name : "+Name);
        System.out.println("Salary : "+Salary);
    }
}
