/*
 * Program: Body Mass Index (BMI) Calculator
 * Formula: BMI = weight(kg) / (height(m))^2
 */

import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("Your BMI = " + bmi);

        sc.close();
    }
}
