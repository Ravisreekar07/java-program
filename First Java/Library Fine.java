import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int days = sc.nextInt();

        if (days > 30) {
            System.out.println("Membership cancelled.");
        } else if (days > 10) {
            double fine = days * 5.0;
            System.out.println("Fine: Rs. " + fine);
        } else if (days >= 6) {
            double fine = days * 1.0;
            System.out.println("Fine: Rs. " + fine);
        } else if (days >= 1) {
            double fine = days * 0.50;
            System.out.println("Fine: Rs. " + fine);
        } else {
            System.out.println("No fine. Book returned on time.");
        }

        sc.close();
    }
}
