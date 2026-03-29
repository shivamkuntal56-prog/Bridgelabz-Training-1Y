package Story4;

public class Runner {
    public static void main(String[] args) {
        Employee e1 = new Manager("RS302", "Rahul Sharma", "HR");

        System.out.println("Manager Email: " + e1.generateEmail());
    }
}
