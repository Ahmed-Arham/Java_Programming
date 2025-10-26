/*
 * Program: Convert USD to INR using Type Casting
 */

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inrRate = 83.2; // current exchange rate
        int rupees = (int) (usd * inrRate); // explicit casting

        System.out.println(usd + " USD ≈ " + rupees + " INR (approx)");

        sc.close();
    }
}
