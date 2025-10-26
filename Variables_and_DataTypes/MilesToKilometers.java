/*
 * Program: Miles to Kilometers Converter
 * Formula: km = miles * 1.60934
 */

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();

        double km = miles * 1.60934;
        System.out.println(miles + " miles = " + km + " kilometers");

        sc.close();
    }
}
