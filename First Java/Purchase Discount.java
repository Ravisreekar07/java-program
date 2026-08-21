import java.util.Scanner;

public class PurchaseDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = sc.nextDouble();

        double totalCost = quantity * pricePerItem;

        if (quantity > 100) {
            double discount = totalCost * 0.10;
            totalCost = totalCost - discount;
            System.out.println("Discount applied: " + discount);
        }

        System.out.println("Total expense: " + totalCost);

        sc.close();
    }
}
