import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                sum += sc.nextInt();
            } else if (sc.next().equalsIgnoreCase("x")) {
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
