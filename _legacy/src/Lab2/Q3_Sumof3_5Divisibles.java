package Lab2;

import java.util.Scanner;
 
public class Q3_Sumof3_5Divisibles {
 
    // by 3 OR 5
    public static int calculateSumOr(int n) {
        int count = 0, sum = 0, current = 1;
 
        while (count < n) {
            if (current % 3 == 0 || current % 5 == 0) {
                sum += current;
                count++;
            }
            current++;
        }
 
        return sum;
    }
 
    // by 3 AND 5
    public static int calculateSumAnd(int n) {
        int count = 0, sum = 0, current = 1;
 
        while (count < n) {
            if (current % 3 == 0 && current % 5 == 0) {
                sum += current;
                count++;
            }
            current++;
        }
 
        return sum;
    }
 
    // Main method
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter how many numbers you want to consider (n): ");
        int n = scanner.nextInt();
 
        int sumOr = calculateSumOr(n);
        int sumAnd = calculateSumAnd(n);
 
        System.out.println("Sum of first " + n + " natural numbers divisible by 3 OR 5: " + sumOr);
        System.out.println("Sum of first " + n + " natural numbers divisible by 3 AND 5: " + sumAnd);
 
        scanner.close();
    }
}