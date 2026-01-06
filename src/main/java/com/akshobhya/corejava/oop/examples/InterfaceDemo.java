package com.akshobhya.corejava.oop.examples;

/**
 * Demonstrates abstraction using interface.
 */
public class InterfaceDemo {

    interface NotificationService {
        void notifyUser();

        default void log() {
            System.out.println("Notification logged");
        }
    }

    static class EmailNotification implements NotificationService {
        public void notifyUser() {
            System.out.println("Email notification sent");
        }
    }

    public static void main(String[] args) {
        NotificationService service = new EmailNotification();
        service.notifyUser();
        service.log();
    }
}
