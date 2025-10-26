/*
 * Program: Demonstrate Explicit Type Casting (Narrowing Conversion)
 */

import java.util.Scanner;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();

        int intValue = (int) num; // explicit narrowing

        System.out.println("Original double value: " + num);
        System.out.println("After explicit casting to int: " + intValue);

        sc.close();
    }
}
