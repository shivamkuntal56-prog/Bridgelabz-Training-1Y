package Story4;

public class Manager extends Employee{

    String department;
    public Manager(String empId, String name,String department) {
        super(empId, name);
        this.department=department;
    }

    @Override
    public String generateEmail() {

        return formatName()+"."+department.toLowerCase()+"@company.com";
    }
}
