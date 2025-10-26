/*
 * Program: Check if Input is Alphabet, Digit, or Special Character
 */

import java.util.Scanner;

public class CheckCharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch))
            System.out.println(ch + " is an Alphabet.");
        else if (Character.isDigit(ch))
            System.out.println(ch + " is a Digit.");
        else
            System.out.println(ch + " is a Special Character.");

        sc.close();
    }
}
