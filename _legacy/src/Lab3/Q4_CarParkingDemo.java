package Lab3;

import java.util.Scanner;
 
public class Q4_CarParkingDemo {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        CarParking cp = new CarParking();
        int tokenCounter = 100;
 
        while (true) {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Show Available Parking");
            System.out.println("2. Park a Car");
            System.out.println("3. Get a Car (by token number)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // flush
 
            switch (choice) {
                case 1:
                    cp.showAvailability();
                    break;
 
                case 2:
                    System.out.print("Enter Registration Number: ");
                    String reg = scanner.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String name = scanner.nextLine();
                    Car car = new Car(reg, name, tokenCounter++);
                    cp.parkCar(car);
                    System.out.println("Car Token No: " + car.getTokenNo());
                    break;
 
                case 3:
                    System.out.print("Enter Token Number: ");
                    int token = scanner.nextInt();
                    Car retrieved = cp.getCar(token);
                    if (retrieved != null) {
                        System.out.println("Car Retrieved - RegNo: " + retrieved.getRegNo() +
                                ", Owner: " + retrieved.getOwnerName());
                    }
                    break;
 
                case 4:
                    System.out.println("Exiting...");
                    return;
 
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}