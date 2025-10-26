/*
 * Program: Demonstrate Precision Loss when Casting from Double to Int
 */

import java.util.Scanner;

public class DoubleToIntRounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double val = sc.nextDouble();

        int rounded = (int) Math.round(val);
        int truncated = (int) val;

        System.out.println("Original: " + val);
        System.out.println("Truncated (no rounding): " + truncated);
        System.out.println("Rounded (using Math.round): " + rounded);

        sc.close();
    }
}
