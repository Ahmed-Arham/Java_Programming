/*
 * Program: Sum of First 10 Natural Numbers
 */

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers = " + sum);
    }
}

/*
Output:
Sum of first 10 natural numbers = 55
*/
