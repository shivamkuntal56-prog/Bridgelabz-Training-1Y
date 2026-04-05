package Assignment_13.Question2;

public class Runner {
    public static void main(String[] args) {
        Thread security = new Thread(new SmartHome("Security Camera", 3000));
        Thread temp = new Thread(new SmartHome("Temperature Sensor", 5000));
        Thread light = new Thread(new SmartHome("Light Controller", 4000));
        Thread door = new Thread(new SmartHome("Door Lock Monitor", 6000));

        security.setPriority(10);
        temp.setPriority(7);;
        light.setPriority(5);
        door.setPriority(5);

        security.start();
        temp.start();
        light.start();
        door.start();
    }
}
