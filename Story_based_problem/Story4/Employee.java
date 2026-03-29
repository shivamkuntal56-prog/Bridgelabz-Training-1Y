package Story4;

public abstract class Employee {
    String empId;
    String name;

    public Employee(String empId,String name){
        this.empId=empId;
        this.name=name;
    }
    public abstract String generateEmail();

    String formatName(){
        return name.trim().toLowerCase().replace(" ","");
    }
}
