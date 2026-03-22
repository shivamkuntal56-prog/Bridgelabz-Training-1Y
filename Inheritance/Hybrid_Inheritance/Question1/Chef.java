package Hybrid_Inheritance.Question_1;

public class Chef extends Person implements Worker{

    public Chef(String name, String id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println(name+" is cooking food");
    }
    public void displayChefDetail(){
        displayDetails();
    }
}
