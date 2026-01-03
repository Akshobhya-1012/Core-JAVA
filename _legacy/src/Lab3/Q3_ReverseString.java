package Lab3;

import java.util.Scanner;
 
public class Q3_ReverseString {
 
    public static String reverseIt(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
 
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
 
            left++;
            right--;
        }
 
        return new String(chars);
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = scanner.nextLine();
 
        String reversed = reverseIt(input);
        System.out.println("Reversed string: " + reversed);
    }
}
 