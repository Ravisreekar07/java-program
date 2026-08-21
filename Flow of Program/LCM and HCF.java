import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int a = n1, b = n2;

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        System.out.println("HCF = " + a);
        System.out.println("LCM = " + (n1 * n2) / a);
    }
}
