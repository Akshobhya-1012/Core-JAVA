package Lab2;

import java.util.Scanner;
 
public class Q1_SumOfThebesOfDigits {
 
    // Method to calculate sum of cubes of digits
    public static int sumOfCubes(int number) {
        int sum = 0;
 
        while (number > 0) {
            int digit = number % 10;        
            sum += digit * digit * digit;   
            number /= 10;                   
        }
 
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Enter an integer number: ");
        int inputNumber = scanner.nextInt();
 
        int cubeSum = sumOfCubes(inputNumber);
        System.out.println("Sum of cubes of digits of " + inputNumber + " is: " + cubeSum);
 
        scanner.close();
    }
}
 