package Hybrid_Inheritance.Question_1;

public class Person {
    String name;
    String id;

    public Person(String name,String id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("Id :"+id);
    }
}
