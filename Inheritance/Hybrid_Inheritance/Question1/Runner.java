package Hybrid_Inheritance.Question_1;

public class Runner {
    public static void main(String[] args) {
        Chef c1 = new Chef("Rahul","Sa23");
        Waiter w1 = new Waiter("Aman","An89");

        c1.performDuties();
        c1.displayChefDetail();

        System.out.println("------------------------");

        w1.performDuties();
        w1.displayWaiterDetail();
    }
}
