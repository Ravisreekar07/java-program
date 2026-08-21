import java.util.Scanner;

class ArmstrongRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}