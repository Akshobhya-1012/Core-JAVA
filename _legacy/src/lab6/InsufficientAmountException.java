package lab6;

// Custom exception for insufficient balance
class InsufficientAmountException extends Exception {
    public InsufficientAmountException(String message) {
        super(message);
    }
}