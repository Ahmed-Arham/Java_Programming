/*
 * Program: Arithmetic Operators Demo
 * Description: Demonstrates +, -, *, /, % operators using user input.
 */

import java.util.Scanner;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + ((b != 0) ? (a / b) : "Undefined (Division by Zero)"));
        System.out.println("Remainder = " + ((b != 0) ? (a % b) : "Undefined"));

        sc.close();
    }
}
