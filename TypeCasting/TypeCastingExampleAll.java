/*
 * Program: Demonstrate All Types of Casting Together
 */

public class TypeCastingExampleAll {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;              // implicit
        double d = i;           // implicit
        float f = (float) d;    // explicit
        long l = (long) f;      // explicit

        System.out.println("byte -> int: " + i);
        System.out.println("int -> double: " + d);
        System.out.println("double -> float: " + f);
        System.out.println("float -> long: " + l);
    }
}
