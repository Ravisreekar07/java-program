import java.util.Scanner;

class RupeesToUSD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double usd = rupees / 95.42;

        System.out.println("Amount in USD = $" + usd);

        sc.close();
    }
}