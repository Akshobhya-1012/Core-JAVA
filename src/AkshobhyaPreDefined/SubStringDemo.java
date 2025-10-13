package AkshobhyaPreDefined;

import java.util.Scanner;
 
public class SubStringDemo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
 
        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();
 
        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();
 
        String result = PreDefinedMethods.customSubstring(input, start, end);
        System.out.println("Substring: " + result);
 
        scanner.close();
    }
}