package Lab3;

import java.util.Scanner;
 
public class Q1_FrequencyInArray {
    public static int countFrequency(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
 
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
 
        int frequency = countFrequency(numbers, target);
        System.out.println("Frequency of " + target + " is: " + frequency);
        
        scanner.close();
    }
}