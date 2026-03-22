package Assisted_Problems.Question_2;

public class Intern extends Employee {

    private String duration = "12 months";

    public Intern(String name, int id, double salary) {
        super(name, id, salary);
        this.duration = duration;
    }
    public void displayDetail(){
        super.displayDetail();
        System.out.println("Internship Duration : "+duration);
    }
}
