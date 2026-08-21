import java.util.Scanner;

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

        System.out.print("Intersection: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // avoid printing same match twice
                }
            }
        }

        sc.close();
    }
}
