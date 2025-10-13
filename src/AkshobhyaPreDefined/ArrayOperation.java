package AkshobhyaPreDefined;

import java.util.Scanner;
 
public class ArrayOperation {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        String[] originalNames = new String[10];
 
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
            originalNames[i] = names[i];
        }
 
        
        int[] indicesToReplace = {2, 4, 6, 8};
        for (int index : indicesToReplace) {
            System.out.print("Enter new name for index " + index + " (currently \"" + names[index] + "\"): ");
            names[index] = scanner.nextLine();
        }
 
       
        int[] indicesToDelete = {3, 7};
        for (int index : indicesToDelete) {
            names[index] = null;
        }
 
        
        System.out.println("\nOriginal Names:");
        for (String name : originalNames) {
            System.out.print(name + " ");
        }
 
        System.out.println("\n\nFinal Names");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.print(names[i] + " ");
            } else {
                System.out.print("[null] ");
            }
        }
 
        scanner.close();
    }
}