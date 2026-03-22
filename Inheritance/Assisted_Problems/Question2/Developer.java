package Assisted_Problems.Question_2;

public class Developer extends Employee{

    private String programmingLanguage = "java";

    public Developer(String name, int id, double salary) {
        super(name, id, salary);
    }
    public void displayDetail(){
        super.displayDetail();
        System.out.println("programming Language : "+programmingLanguage);
    }
}
