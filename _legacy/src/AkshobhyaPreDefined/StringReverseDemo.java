package AkshobhyaPreDefined;

import java.util.Scanner;
 
public class StringReverseDemo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        
        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();
 
        
        String reversed = PreDefinedMethods.reverseString(userInput);
 
        
        System.out.println("Reversed String: " + reversed);
    }
}