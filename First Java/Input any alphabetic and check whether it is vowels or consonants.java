import java.util.Scanner;
public class TernaryPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      System.out.print("Enter an alphabet: ");
        char ch2 = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch2);
        String vowelCheck = (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                ? "Vowel" : "Consonant";
        System.out.println(ch2 + " is: " + vowelCheck);
    }
}
