/*
 * Program: Check if a Number is Even or Odd using if-else
 */

import java.util.Scanner;

public class EvenOddCheckIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");

        sc.close();
    }
}
