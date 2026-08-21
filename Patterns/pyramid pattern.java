
public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // leading spaces: one space per missing row (keeps "1" centered)
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            // numbers 1 to i, single space between
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
