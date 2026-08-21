import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter any character: ");
        char ch3 = sc.next().charAt(0);
        String type = Character.isLetter(ch3) ? "Alphabet"
                : Character.isDigit(ch3) ? "Digit"
                : "Special Character";
        System.out.println(ch3 + " is: " + type);

        sc.close();

    }
}
