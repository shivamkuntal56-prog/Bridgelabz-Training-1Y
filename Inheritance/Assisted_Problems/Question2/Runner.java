package Assisted_Problems.Question_2;

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Manager("Rahul",123,1000000);
        Employee e2 = new Developer("Shivam",124,1000000);
        Employee e3 = new Intern("Keshav",125,40000);
        e1.displayDetail();
        System.out.println("------------------------");
        e2.displayDetail();
        System.out.println("--------------------------");
        e3.displayDetail();
    }
}
