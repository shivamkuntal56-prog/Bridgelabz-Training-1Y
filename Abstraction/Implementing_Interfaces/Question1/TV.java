package Implementing_Interfaces.Question_1;

public class TV implements SmartDevice{
    @Override
    public void turnOff() {
        System.out.println("TV is off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV is on");
    }
}
