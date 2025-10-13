package Lab5;
import java.util.Scanner;
 
class TollBooth {
    private int totalCars;
    private double totalCash;
 
    // Constructor: Initializes totals to 0
    public TollBooth() {
        totalCars = 0;
        totalCash = 0.0;
    }
 
    // Car paid the toll
    public void payingCar() {
        totalCars++;
        totalCash += 50.0;
    }
 
    // Car did not pay
    public void nonPayCar() {
        totalCars++;
    }
 
    // Display current stats
    public void display() {
        System.out.println("Total cars passed: " + totalCars);
        System.out.println("Total cash collected: ₹" + totalCash);
    }
}
 
public class Q3_TollBoothTest {
    public static void main(String[] args) {
        TollBooth booth = new TollBooth();
Scanner scanner = new Scanner(System.in);
 
        System.out.println("Toll Booth System");
        System.out.println("Press 1 for Paying Car");
        System.out.println("Press 2 for Non-Paying Car");
        System.out.println("Press 3 to Display Total");
        System.out.println("Press 0 to Exit");
 
        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
 
            switch (choice) {
                case 1:
                    booth.payingCar();
                    break;
                case 2:
                    booth.nonPayCar();
                    break;
                case 3:
                    booth.display();
                    break;
                case 0:
                    System.out.println("Exiting... Final stats:");
                    booth.display();
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
 
        } while (choice != 0);
 
        scanner.close();
    }
}