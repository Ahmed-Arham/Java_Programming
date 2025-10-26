/*
 * Program: Simple Interest Calculator
 * Formula: (P * R * T) / 100
 */

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1000, rate = 5, time = 2;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }
}

/*
Output:
Simple Interest = 100.0
*/
