/*
 * Program: Convert Character to its ASCII value using Type Casting
 */

import java.util.Scanner;

public class CharToIntASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int ascii = (int) ch; // char to int

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);

        sc.close();
    }
}
