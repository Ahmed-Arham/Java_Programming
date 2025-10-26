/*
 * Program: Display Even and Odd Numbers
 * Description: Prints even and odd numbers from 1 to 10.
 */

public class EvenOddDisplay {
    public static void main(String[] args) {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

/*
Output:
Even Numbers:
2 4 6 8 10 
Odd Numbers:
1 3 5 7 9
*/
