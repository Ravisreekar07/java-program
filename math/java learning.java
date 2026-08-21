import java.util.Scanner;

class LibraryFine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days late: ");
        int days = sc.nextInt();

        if (days > 30) {
            System.out.println("Membership cancelled.");
        } 
        else if (days > 10) {
            System.out.println("Fine = Rs. 5");
        } 
        else if (days > 5) {
            System.out.println("Fine = Rs. 1");
        } 
        else if (days > 0) {
            System.out.println("Fine = Rs. 0.50");
        } 
        else {
            System.out.println("No fine.");
        }

        sc.close();
    }
}