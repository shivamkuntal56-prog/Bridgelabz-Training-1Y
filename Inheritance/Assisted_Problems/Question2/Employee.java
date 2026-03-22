package Assisted_Problems.Question_2;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetail(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
    }
}
