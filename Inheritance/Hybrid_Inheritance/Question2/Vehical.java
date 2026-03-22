package Hybrid_Inheritance.Question_2;

public class Vehical {
    int maxSpeed;
    String model;

    public Vehical(int maxSpeed,String modal){
        this.maxSpeed=maxSpeed;
        this.model=modal;
    }
    public void displayDetail(){
        System.out.println("Maximum Speed : "+maxSpeed);
        System.out.println("Modal : "+model);
    }
}
