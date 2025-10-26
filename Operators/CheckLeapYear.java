/*
 * Program: Check Leap Year using Logical and Relational Operators
 */

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(year + (isLeap ? " is a Leap Year" : " is NOT a Leap Year"));

        sc.close();
    }
}
