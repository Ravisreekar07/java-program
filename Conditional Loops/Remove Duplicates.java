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

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (temp[k] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }

        int[] result = Arrays.copyOf(temp, j);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
        sc.close();
    }
}
