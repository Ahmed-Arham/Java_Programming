/*
 * Program: Convert Integer (ASCII value) to Character using Type Casting
 */

import java.util.Scanner;

public class IntToCharASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value (0–127): ");
        int ascii = sc.nextInt();

        char ch = (char) ascii; // int to char

        System.out.println("The character for ASCII value " + ascii + " is: " + ch);

        sc.close();
    }
}
