package lab6;

import java.util.Scanner;
 

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
 

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
 
public class Q2_StringCalculator {
 
    public static int calculateSum(String input) throws InvalidInputException, NegativeNumberException {
        if (input == null || input.trim().isEmpty()) {
            return 0; 
        }
 
        String[] parts = input.split(",");
        int sum = 0;
 
        for (String part : parts) {
            part = part.trim();
            try {
                int num = Integer.parseInt(part);
 
                if (num < 0) {
                    throw new NegativeNumberException("Negative numbers not allowed: " + num);
                }
 
                sum += num;
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Invalid input detected: " + part);
            }
        }
 
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter comma-separated numbers: ");
        String input = scanner.nextLine();
 
        try {
            int result = calculateSum(input);
            System.out.println("Sum = " + result);
        } catch (InvalidInputException | NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
 