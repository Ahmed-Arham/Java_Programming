/*
 * Program: Currency Converter (USD to INR)
 * Conversion Rate: 1 USD = 83 INR (example)
 */

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * 83;
        System.out.println(usd + " USD = " + inr + " INR");

        sc.close();
    }
}
