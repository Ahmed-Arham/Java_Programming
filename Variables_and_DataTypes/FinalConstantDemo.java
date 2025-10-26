/*
 * Program: Constant Example
 * Description: Demonstrates use of final keyword for constants.
 */

import java.util.Scanner;

public class FinalConstantDemo {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of Circle = " + area);
        sc.close();
    }
}
