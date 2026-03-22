package Hybrid_Inheritance.Question_1;

public class Waiter extends Person implements Worker{
    public Waiter(String name, String id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
    public void displayWaiterDetail(){
        displayDetails();
    }
}
