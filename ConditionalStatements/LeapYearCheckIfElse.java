/*
 * Program: Check if a Year is a Leap Year using if-else
 */

import java.util.Scanner;

public class LeapYearCheckIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year % 400 == 0)
            System.out.println(year + " is a Leap Year.");
        else if (year % 100 == 0)
            System.out.println(year + " is NOT a Leap Year.");
        else if (year % 4 == 0)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");

        sc.close();
    }
}
