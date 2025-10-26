/*
 * Program: Demonstrate Mixed Type Operations and Casting
 */

public class MixedTypeOperation {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;

        double result = a + b; // int + double → double
        int castResult = (int) result; // explicit cast back to int

        System.out.println("Sum (double): " + result);
        System.out.println("After casting to int: " + castResult);
    }
}
