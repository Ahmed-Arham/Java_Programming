/*
 * Program: Check Eligibility for Voting and Driving
 */

import java.util.Scanner;

public class EligibilityCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18 && age < 21)
            System.out.println("You can vote but cannot drive a commercial vehicle.");
        else if (age >= 21)
            System.out.println("You are eligible for voting and driving both.");
        else
            System.out.println("You are not eligible for voting or driving.");

        sc.close();
    }
}
