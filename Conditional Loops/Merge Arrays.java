import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter " + n1 + " elements: ");
        for (int i = 0; i < n1; i++)
            arr1[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter " + n2 + " elements: ");
        for (int i = 0; i < n2; i++)
            arr2[i] = sc.nextInt();

        int[] merged = new int[n1 + n2];
        for (int i = 0; i < n1; i++)
            merged[i] = arr1[i];
        for (int i = 0; i < n2; i++)
            merged[n1 + i] = arr2[i];

        System.out.println("Merged array: " + Arrays.toString(merged));
        sc.close();
    }
}
