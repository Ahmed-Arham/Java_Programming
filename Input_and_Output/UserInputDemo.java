/*
 * Program: User Input Demo
 * Description: Demonstrates reading different data types from the user.
 */

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        sc.nextLine(); // Consume leftover newline
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\n--- Displaying User Input ---");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + d);
        System.out.println("Name: " + name);

        sc.close();
    }
}

/*
Sample Output:
Enter an integer: 10
Enter a double: 3.14
Enter your name: Arham
--- Displaying User Input ---
Integer: 10
Double: 3.14
Name: Arham
*/

