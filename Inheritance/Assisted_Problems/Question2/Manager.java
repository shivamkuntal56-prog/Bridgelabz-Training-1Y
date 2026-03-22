package Assisted_Problems.Question_2;

public class Manager extends Employee{
    private String  teamSize = "13 members";
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }
    @Override
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Team size : "+teamSize);
    }
}
