package Story2;

public class Order {
    String orderId;
    int baseAmount;

    static double deliveryCharge = 40;
    public Order(String orderId,int baseAmount){
        this.orderId=orderId;
        this.baseAmount=baseAmount;
    }
    double calculateBill(){
        return baseAmount+deliveryCharge;
    }
}
