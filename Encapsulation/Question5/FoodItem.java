package Encapsulation.Question_6;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName,double price,int quantity){
        this.itemName= itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    protected void setPrice(double price) {
        if (price > 0)
        {
            this.price = price;
        }
    }
    public abstract double calculateTotalPrice();

    public void getItemDetails(){
        System.out.println("Item Name : "+itemName);
        System.out.println("price : "+price);
        System.out.println("quantity : "+quantity);
    }
}
