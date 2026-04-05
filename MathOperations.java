/**
 * 13. Create a class MathOperations.
 * • Create a method add() that takes two integers.
 * • Overload the add() method to take three integers.
 * • Overload it again to take two double values.
 */
public class MathOperations {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 ints: " + math.add(10, 20));
        System.out.println("Sum of 3 ints: " + math.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + math.add(10.5, 20.5));
    }
}
