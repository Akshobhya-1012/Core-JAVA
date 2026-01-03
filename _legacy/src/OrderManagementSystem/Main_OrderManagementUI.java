package OrderManagementSystem;

import java.util.Scanner;

public class Main_OrderManagementUI {
	 
    
    static Order[] orders = new Order[100];
    static int orderCount = 0;
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Order management System ======");
            System.out.println("1. Add Order");
            
            System.out.println("2. View Orders");
            
            
            
            System.out.println("3. Cancel Order");
            System.out.println("4. Search Order");
            
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  
 
            switch (choice) {
                case 1 : placeOrder();
                break;
                case 2 : viewOrders();
                break;
               
                
                case 3 : cancelOrder();
                break;
                case 4 : searchOrder();
                break;
                
                case 9 : System.out.println("Exiting the system.");
                break;
                default : System.out.println("Invalid choice.");
                break;
            }
        } while (choice != 9);
    }
 

    
    static void placeOrder() {
        if (orderCount < 100) {
            System.out.print("Enter Customer Name: ");
            String customerName = sc.nextLine();
            System.out.print("Enter Order Amount: ");
            int orderAmount = sc.nextInt();
            orders[orderCount++] = new Order(orderCount, customerName,orderAmount);
            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order list is full.");
        }
    }
 

    static void viewOrders() {
        if (orderCount == 0) {
            System.out.println("No orders placed.");
        } else {
            System.out.println("----- Orders List -----");
            for (int i = 0; i < orderCount; i++) {
                System.out.println((i + 1) + ", Order ID: " +orders[i].orderId+ ". Customer Name: " + orders[i].customerName + ", Order Amount: " + orders[i].orderAmount + ", Order Status: " +orders[i].status);
            }
        }
    }
 
    static void searchOrder() {
        System.out.println("Search Order By:\n1. Customer Name\n2. Order ID");
        int option = sc.nextInt();
        sc.nextLine();
     
        boolean found = false;
     
        if (option == 1) {
            System.out.print("Enter Customer Name to search: ");
            String name = sc.nextLine();
            for (int i = 0; i < orderCount; i++) {
                if (orders[i].customerName.equalsIgnoreCase(name)) {
                    System.out.println("Order Found: ID = " + orders[i].orderId + ", Amount = " + orders[i].orderAmount + ", Status = " + orders[i].status);
                    found = true;
                }
            }
        } else if (option == 2) {
            System.out.print("Enter Order ID to search: ");
            int id = sc.nextInt();
            for (int i = 0; i < orderCount; i++) {
                if (orders[i].orderId == id) {
                   System.out.println("Order Found: Customer = " + orders[i].customerName + ", Amount = " + orders[i].orderAmount + ", Status = " + orders[i].status);
                    found = true;
                }
            }
        } else {
            System.out.println("Invalid option.");
        }
     
        if (!found) {
            System.out.println("No matching order found.");
        }
    } 
 
    static void cancelOrder() {
        System.out.println("Cancel Order By:\n1. Customer Name\n2. Order ID");
        int option = sc.nextInt();
        sc.nextLine();
     
        boolean found = false;
     
        try {
            if (option == 1) {
                System.out.print("Enter Customer Name to cancel order: ");
                String name = sc.nextLine();
     
                for (int i = 0; i < orderCount; i++) {
                    if (orders[i].customerName.equalsIgnoreCase(name)) {
                        
                        for (int j = i; j < orderCount - 1; j++) {
                            orders[j] = orders[j + 1];
                        }
                        orderCount--;
                        found = true;
                        System.out.println("Order for '" + name + "' cancelled successfully.");
                        break;
                    }
                }
     
                if (!found) {
                    throw new OrderNotFoundException("Order for customer '" + name + "' not found.");
                }
     
            } else if (option == 2) {
                System.out.print("Enter Order ID to cancel: ");
                int id = sc.nextInt();
     
                for (int i = 0; i < orderCount; i++) {
                    if (orders[i].orderId == id) {
                        
                        for (int j = i; j < orderCount - 1; j++) {
                            orders[j] = orders[j + 1];
                        }
                        orderCount--;
                        found = true;
                        System.out.println("Order ID " + id + " cancelled successfully.");
                        break;
                    }
                }
     
                if (!found) {
                    throw new OrderNotFoundException("Order ID '" + id + "' not found.");
                }
     
            } else {
                System.out.println("Invalid option selected.");
            }
        } catch (OrderNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
     
 
}
