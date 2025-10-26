/*
 * Program: Demonstrate Implicit Type Casting (Widening Conversion)
 */

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        int intValue = 50;
        double doubleValue = intValue; // implicit widening

        System.out.println("Integer value: " + intValue);
        System.out.println("After implicit casting to double: " + doubleValue);
    }
}
