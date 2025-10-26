/*
 * Program: Square and Cube of a Number
 */

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        System.out.println("Square = " + (num * num));
        System.out.println("Cube = " + (num * num * num));
        sc.close();
    }
}
