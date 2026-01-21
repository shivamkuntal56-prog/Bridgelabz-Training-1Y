import java.util.Scanner;

class University{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int fee = input.nextInt();
        int discountPercent = input.nextInt();

        int discount = fee * discountPercent / 100;
        int finalFee = fee - discount;

        System.out.println("The discount amount is  " + discount +
                " and final discounted fee is " + finalFee);
}
}