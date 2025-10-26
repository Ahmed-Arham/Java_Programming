/*
 * Program: Logical Operators Demo
 */

import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.println("\n--- Logical Operations ---");
        System.out.println("Eligible for Job (age > 18 && salary > 10000): " + (age > 18 && salary > 10000));
        System.out.println("Student Discount (age < 25 || salary < 5000): " + (age < 25 || salary < 5000));
        System.out.println("Negation (!): " + !(age < 18));

        sc.close();
    }
}
