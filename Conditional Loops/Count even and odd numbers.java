import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
        sc.close();
    }
}
