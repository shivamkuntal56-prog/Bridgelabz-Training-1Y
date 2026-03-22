package Assisted_Problems.Question_3;

public class Runner {
    public static void main(String[] args) {
        Vehicle[] Vehical = new Vehicle[3];

        Vehical[0] = new Car(300,"petrol");
        Vehical[1] = new Truck(120,"diesel");
        Vehical[2] = new MotorCycle(140,"petrol");

        for (Vehicle v : Vehical){
            v.displayInfo();
            System.out.println();
        }
    }
}
