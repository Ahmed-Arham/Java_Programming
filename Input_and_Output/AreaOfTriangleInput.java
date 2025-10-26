/*
 * Program: Area of Triangle
 * Formula: Area = 0.5 * base * height
 */

import java.util.Scanner;

public class AreaOfTriangleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);

        sc.close();
    }
}
