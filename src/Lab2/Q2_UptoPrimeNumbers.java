package Lab2;

import java.util.Scanner;
 
public class Q2_UptoPrimeNumbers {
 
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
       
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
 
        System.out.println("Prime numbers till " + limit + " are:");
 
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
 
        scanner.close();
    }
}