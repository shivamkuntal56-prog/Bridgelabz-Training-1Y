package Implementing_Interfaces.Question_1;

public class Light implements SmartDevice{
    @Override
    public void turnOff() {
        System.out.println("light is off");
    }

    @Override
    public void turnOn() {
        System.out.println("light is on");
    }
}
