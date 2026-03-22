package Hybrid_Inheritance.Question_2;

public class Runner {
    public static void main(String[] args) {
        ElectricVehicle e1 = new ElectricVehicle(230,"xev9");
        PetrolVehicle p1 = new PetrolVehicle(250,"Thar");

        e1.displayDetail();
        e1.charge();

        System.out.println("--------------------");

        p1.displayDetail();
        p1.refuel();
    }
}
