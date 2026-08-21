import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int[] reversed = new int[n];
        for (int i = 0; i < n; i++)
            reversed[i] = arr[n - 1 - i];

        System.out.println("Reversed array: " + Arrays.toString(reversed));
        sc.close();
    }
}
