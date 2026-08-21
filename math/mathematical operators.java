import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println("Result = " + (num1 + num2));
        }
        else if (operator == '-') {
            System.out.println("Result = " + (num1 - num2));
        }
        else if (operator == '*') {
            System.out.println("Result = " + (num1 * num2));
        }
        else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            }
            else {
                System.out.println("Cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}