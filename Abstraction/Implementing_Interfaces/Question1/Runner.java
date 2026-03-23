package Implementing_Interfaces.Question_1;

public class Runner {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new Ac();
        SmartDevice tv = new TV();

        light.turnOff();
        light.turnOn();

        System.out.println("---------------------------");

        ac.turnOff();
        ac.turnOn();

        System.out.println("-----------------------------");

        tv.turnOff();
        tv.turnOn();
    }
}
