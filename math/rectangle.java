import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        }
        else {
            System.out.println("Area is not greater than perimeter");
        }

        sc.close();
    }
}