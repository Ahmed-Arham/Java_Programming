/*
 * Program: Convert Minutes to Hours and Minutes
 */

import java.util.Scanner;

public class ConvertMinutesToHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total minutes: ");
        int minutes = sc.nextInt();

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        System.out.println(minutes + " minutes = " + hours + " hours and " + remainingMinutes + " minutes");

        sc.close();
    }
}
