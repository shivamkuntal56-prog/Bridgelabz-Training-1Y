package Encapsulation.Question_3;

public class Runner {
    public static void main(String[] args) {
      Car c1 = new Car("up-82 008","car",1500);
      System.out.println("Car Details:");
      double carRent = c1.calculateRentalCost(2);
      double carInsurance = c1.calculateInsurance(2);

      System.out.println("Rental Cost: " + carRent);
      System.out.println("Insurance Cost: " + carInsurance);
      System.out.println("Total Cost: " + (carRent + carInsurance));
      System.out.println(c1.getInsuranceDetails());

      System.out.println("----------------------------");
      
      Bike b1= new Bike("up-82 009","bike",500);
        System.out.println("Bike Details");
        double bikeRent = b1.calculateRentalCost(3);
        double bikeInsurance = b1.calculateInsurance(3);

        System.out.println("rental cost : "+bikeRent);
        System.out.println("Insurance cost :"+bikeInsurance);
        System.out.println("Total cost : "+(carRent+bikeInsurance));
        System.out.println(b1.getInsuranceDetails());

        System.out.println("----------------------------");

        Truck t1= new Truck("up-82 005","Truck",2000);
        System.out.println("Bike Details");
        double truckRent = t1.calculateRentalCost(5);
        double truckInsurance = t1.calculateInsurance(5);

        System.out.println("rental cost : "+truckRent);
        System.out.println("Insurance cost :"+truckInsurance);
        System.out.println("Total cost : "+(truckRent+truckInsurance));
        System.out.println(t1.getInsuranceDetails());
    }
}
