import java.util.Scanner;

class WorkerEfficiency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time taken in hours: ");
        double time = sc.nextDouble();

        if (time >= 2 && time <= 3) {
            System.out.println("Highly efficient");
        }
        else if (time > 3 && time <= 4) {
            System.out.println("Ordered to improve speed");
        }
        else if (time > 4 && time <= 5) {
            System.out.println("Given training to improve speed");
        }
        else if (time > 5) {
            System.out.println("Worker has to leave the company");
        }
        else {
            System.out.println("Invalid time");
        }

        sc.close();
    }
}