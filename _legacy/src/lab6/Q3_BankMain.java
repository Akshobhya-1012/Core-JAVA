package lab6;

// Test class
public class Q3_BankMain {
    public static void main(String[] args) {
        BankService bank = new BankService(12345, 5000);
 
        try {
            bank.withdraw(12345, 1500);  
            bank.withdraw(12345, 4000);  
        } catch (InvalidAccountNumberException | InsufficientAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
 
        try {
            bank.withdraw(99999, 100); 
        } catch (InvalidAccountNumberException | InsufficientAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}