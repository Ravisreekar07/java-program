public class IsEmpty {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
