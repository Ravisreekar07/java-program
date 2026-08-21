import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double conversionRate = 95.61; 
        double usd = rupees / conversionRate;

        System.out.printf("Amount in USD = $%.2f%n", usd);
    }
}
