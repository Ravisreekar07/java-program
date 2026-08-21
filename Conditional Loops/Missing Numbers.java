import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (numbers from 1 to N, one missing): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];

        System.out.print("Enter " + (n - 1) + " elements: ");
        for (int i = 0; i < n - 1; i++)
            arr[i] = sc.nextInt();

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++)
            actualSum += arr[i];

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
        sc.close();
    }
}
