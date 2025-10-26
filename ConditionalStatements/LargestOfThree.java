/*
 * Program: Find the Largest Among Three Numbers
 */

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        if (a >= b && a >= c)
            System.out.println(a + " is the largest.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest.");
        else
            System.out.println(c + " is the largest.");

        sc.close();
    }
}
