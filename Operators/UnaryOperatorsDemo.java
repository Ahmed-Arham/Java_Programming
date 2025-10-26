/*
 * Program: Unary Operators Demo
 * Description: Demonstrates ++, --, +, - operators.
 */

import java.util.Scanner;

public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n--- Unary Operations ---");
        System.out.println("Original: " + num);
        System.out.println("Post-increment: " + (num++));
        System.out.println("After Post-increment: " + num);
        System.out.println("Pre-increment: " + (++num));
        System.out.println("Pre-decrement: " + (--num));
        System.out.println("Post-decrement: " + (num--));
        System.out.println("After Post-decrement: " + num);
        System.out.println("Negation: " + (-num));

        sc.close();
    }
}
