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

        int[] result = new int[n];
        int j = 0;

        // Copy non-zero elements first
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                result[j] = arr[i];
                j++;
            }
        }
        // Remaining positions are already 0 by default

        System.out.println("Array after moving zeros: " + Arrays.toString(result));
        sc.close();
    }
}
