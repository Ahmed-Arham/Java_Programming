/*
 * Program: Convert Temperature from Celsius to Fahrenheit using Type Casting
 */

import java.util.Scanner;

public class TemperatureConversionWithCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();

        double fahrenheit = (double) ((celsius * 9 / 5) + 32);

        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        sc.close();
    }
}
