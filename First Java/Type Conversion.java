public class TypeConversion {
    public static void main(String[] args) {

        // int to float
        int a = 10;
        float f1 = a;
        System.out.println("int to float: " + f1);

        // float to int
        float f2 = 10.75f;
        int b = (int) f2;
        System.out.println("float to int: " + b);

        // int to double
        int c = 25;
        double d1 = c;
        System.out.println("int to double: " + d1);

        // double to int
        double d2 = 99.99;
        int e = (int) d2;
        System.out.println("double to int: " + e);

        // float to double
        float f3 = 5.5f;
        double d3 = f3;
        System.out.println("float to double: " + d3);

        // double to float
        double d4 = 12.345;
        float f4 = (float) d4;
        System.out.println("double to float: " + f4);
    }
}
