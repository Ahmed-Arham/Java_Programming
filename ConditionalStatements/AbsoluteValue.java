/*
 * Program: Find Absolute Value of a Number
 */

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num < 0)
            num = -num;

        System.out.println("Absolute Value = " + num);
        sc.close();
    }
}
