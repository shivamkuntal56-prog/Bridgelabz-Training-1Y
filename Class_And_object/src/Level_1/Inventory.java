package Level_1;

class Inventory {
    int itemCode;
    String itemName;
    double price;

    Inventory(int code, String name, double price) {
        itemCode = code;
        itemName = name;
        this.price = price;
    }
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    void calculateTotalCost(int quantity) {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }
    public static void main(String[] args) {
        Inventory item = new Inventory(201, "Pen", 10);
        item.displayItem();
        item.calculateTotalCost(5);
    }
}