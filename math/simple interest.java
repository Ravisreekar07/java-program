import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        double simpleInterest = (p * t * r) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        sc.close();
    }
}