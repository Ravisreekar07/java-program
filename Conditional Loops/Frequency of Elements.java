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

        boolean[] counted = new boolean[n];

        System.out.println("Frequency of elements:");
        for (int i = 0; i < n; i++) {
            if (counted[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }

        sc.close();
    }
}
