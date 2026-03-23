package Implementing_Interfaces.Question_1;

public class Ac implements SmartDevice{
    @Override
    public void turnOff() {
        System.out.println("Ac is off");
    }

    @Override
    public void turnOn() {
        System.out.println("Ac is on");
    }
}
