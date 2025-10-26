/*
 * Program: Simple Calculator using if-else
 */

import java.util.Scanner;

public class SimpleCalculatorIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (op == '+')
            System.out.println("Result = " + (a + b));
        else if (op == '-')
            System.out.println("Result = " + (a - b));
        else if (op == '*')
            System.out.println("Result = " + (a * b));
        else if (op == '/')
            System.out.println("Result = " + ((b != 0) ? (a / b) : "Undefined (Division by Zero)"));
        else if (op == '%')
            System.out.println("Result = " + ((b != 0) ? (a % b) : "Undefined"));
        else
            System.out.println("Invalid Operator!");

        sc.close();
    }
}
