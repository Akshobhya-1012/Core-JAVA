package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_reversalOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter numbers to be inserted in original array");
		Scanner scanner = new Scanner(System.in);
		
		int [] arr = new int[10];
		for(int i=0; i<10;i++) {
			arr[i] = scanner.nextInt();
		}
		
		int [] reversedArray = new int[10];
		for(int i=0;i<10;i++) {
			reversedArray[i] = arr[9-i];
		}
		System.out.println("Original array is "+ Arrays.toString(arr));
		System.out.println("Reversed array is "+ Arrays.toString(reversedArray));

	}

}
