import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter a character: ");
        char ch1 = sc.next().charAt(0);
        String isAlpha = Character.isLetter(ch1) ? "Alphabetic" : "Not Alphabetic";
        System.out.println(ch1 + " is: " + isAlpha);
    }
}
