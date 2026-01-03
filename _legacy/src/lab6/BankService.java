package lab6;

// BankService class
class BankService {
 
    private int accountNumber;
    private double balance;
 
    public BankService(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
 
    public void withdraw(int inputAccountNumber, double amount)
            throws InvalidAccountNumberException, InsufficientAmountException {
 
        if (inputAccountNumber != this.accountNumber) {
            throw new InvalidAccountNumberException("Invalid Account Number: " + inputAccountNumber);
        }
 
        if (amount > balance) {
            throw new InsufficientAmountException("Insufficient Balance. Available: " + balance);
        }
 
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
 
    public double getBalance() {
        return balance;
    }
}