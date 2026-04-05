package Assignment_13.Question3;

public class Runner {
    public static void main(String[] args) {
        Thread order1 = new Thread(new Order(101, "Pizza Hub", 4), "Agent-Express-1");
        Thread order2 = new Thread(new Order(102, "Burger Point", 6), "Agent-Standard-1");
        Thread order3 = new Thread(new Order(103, "Biryani House", 8), "Agent-Economy-1");
        Thread order4 = new Thread(new Order(104, "Chinese Corner", 3), "Agent-Express-2");
        Thread order5 = new Thread(new Order(105, "South Cafe", 5), "Agent-Standard-2");

        order1.setPriority(10);
        order2.setPriority(5);
        order3.setPriority(3);
        order4.setPriority(10);
        order5.setPriority(5);

        order1.start();
        order2.start();
        order3.start();
        order4.start();
        order5.start();

    }
}
