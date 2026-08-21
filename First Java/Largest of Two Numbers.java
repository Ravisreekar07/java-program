import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1. Maximum between two numbers
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max2 = (a > b) ? a : b;
        System.out.println("Maximum of two numbers: " + max2);
    }
}
