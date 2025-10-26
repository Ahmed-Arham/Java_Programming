/*
 * Program: Variable Demo
 * Author: Arham Ahmed
 * Description: Demonstrates declaration and initialization of different data types.
 */

import java.util.Scanner;

public class VariableDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intNum = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double doubleNum = sc.nextDouble();

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("\n--- Displaying Entered Values ---");
        System.out.println("Integer: " + intNum);
        System.out.println("Double: " + doubleNum);
        System.out.println("Character: " + ch);
        System.out.println("Name: " + name);

        sc.close();
    }
}
