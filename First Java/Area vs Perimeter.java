import java.util.Scanner;

public class AreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("Area (" + area + ") is greater than Perimeter (" + perimeter + ")");
        } else if (area < perimeter) {
            System.out.println("Perimeter (" + perimeter + ") is greater than Area (" + area + ")");
        } else {
            System.out.println("Area and Perimeter are equal.");
        }

        sc.close();
    }
}
