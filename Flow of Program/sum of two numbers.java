import java.util.Scanner; 

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt(); 
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt(); 
        System.out.println("The sum is: " + (number1 + number2)); 
        scanner.close();
    }
}
