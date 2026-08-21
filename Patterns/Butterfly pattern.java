public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int w = 2 * n - 1; // total width when fully merged

        for (int i = 1; i <= n; i++) printRow(i, w);
        for (int i = n - 1; i >= 1; i--) printRow(i, w);
    }

    static void printRow(int i, int w) {
        for (int p = 0; p < w; p++) {
            System.out.print((p < i || p >= w - i) ? "*" : " ");
        }
        System.out.println();
    }
}
