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

        int first = arr[0];
        for (int i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n - 1] = first;

        System.out.println("Array after left rotation: " + Arrays.toString(arr));
        sc.close();
    }
}
