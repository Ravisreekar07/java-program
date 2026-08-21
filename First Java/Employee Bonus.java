import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

        System.out.print("Enter the year of joining: ");
        int joiningYear = sc.nextInt();

        int yearsOfService = currentYear - joiningYear;

        if (yearsOfService > 3) {
            System.out.println("Years of service: " + yearsOfService);
            System.out.println("Bonus of Rs. 2500 is given to the employee.");
        }

        sc.close();
    }
}
