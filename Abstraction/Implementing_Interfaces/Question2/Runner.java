package Implementing_Interfaces.Question_2;

public class Runner {
    public static void main(String[] args) {
        RentalSystem r1 = new Bikes();
        RentalSystem r2 = new Buses();
        RentalSystem r3 = new Cars();

        r1.rent();
        r1.returnVehicle();

        System.out.println("----------------------");
        r2.rent();
        r2.returnVehicle();

        System.out.println("----------------------");
        r3.rent();
        r3.returnVehicle();
    }
}
