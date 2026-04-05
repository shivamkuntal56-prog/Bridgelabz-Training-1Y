package Assignment14;

public class Question2 {
    public void wrapperToPrimitive(){
        Double num1 = 45.67;
        double num2 = num1;
        int num3 = (int)num2;
        System.out.println("Double : "+num1);
        System.out.println("double : "+num2);
        System.out.println("int type cast : "+num3);
    }
    public static void main(String[] args) {
        Question2 q2 = new Question2();
        q2.wrapperToPrimitive();
    }
}
