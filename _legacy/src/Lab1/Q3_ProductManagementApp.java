package Lab1;
import java.util.Scanner;
public class Q3_ProductManagementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 
		        // Taking user input
		        System.out.print("Enter Product Name: ");
		        String productName = scanner.nextLine();
		 
		        System.out.print("Enter MRP: ");
		        int mrp = scanner.nextInt();
		 
		        System.out.print("Enter Selling Price: ");
		        int sellingPrice = scanner.nextInt();
		 
		        System.out.print("Enter Discount: ");
		        int discount = scanner.nextInt();
		 
//		        scanner.close();
		 
		        // Printing the output
		        System.out.println();
		        System.out.printf("%-5s %-20s %-10s %-15s %-10s%n", "Sr #", "Product Name", "MRP", "Selling Price", "Discount");
		        System.out.println("-------------------------------------------------------------");
		        System.out.printf("%-5d %-20s %-10d %-15d %-10d%n", 1, productName, mrp, sellingPrice, discount);
		    }

	}


