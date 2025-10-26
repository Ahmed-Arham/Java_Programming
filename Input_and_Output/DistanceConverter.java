/*
 * Program: Distance Converter (Km to Miles and vice versa)
 * 1 Km = 0.621371 Miles
 */

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;

        System.out.println(km + " km = " + miles + " miles");

        sc.close();
    }
}

