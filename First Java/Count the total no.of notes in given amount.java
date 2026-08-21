import java.util.Scanner;

public class NotesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Possible note count for amount " + amount + ":");
        for (int note : notes) {
            int count = amount / note;
            int remaining = amount % note;
            System.out.println(note + " -> " + count + " notes (Missing amount to the actual count: " + remaining + ")");
        }

        sc.close();
    }
}
