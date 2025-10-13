package Lab4;

import java.util.Scanner;
 
public class Q1_PasswordGeneration {
 
    public String generatePassword(String firstName, String lastName, String yob) {
       
        String part1 = firstName.length() >= 4 ? firstName.substring(1, 4) : "";
        String part2 = lastName.length() >= 4 ? lastName.substring(1, 4) : "";
        String part3 = yob.length() >= 2 ? yob.substring(yob.length() - 2) : "";
        
        String password = (part1 + part2 + part3).toLowerCase();
 
        return password;
    }
 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Q1_PasswordGeneration util = new Q1_PasswordGeneration();
      
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
 
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
 
        System.out.print("Enter Year of Birth: ");
        String yob = scanner.nextLine();
 
        
        String password = util.generatePassword(firstName, lastName, yob);
 
        System.out.println("Generated Password: " + password);
 
        scanner.close();
    }
}