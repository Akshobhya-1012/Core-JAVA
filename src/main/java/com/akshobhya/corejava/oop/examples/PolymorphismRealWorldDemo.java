package com.akshobhya.corejava.oop.examples;
 
/**
* Real-world example showing interface-based polymorphism
* similar to Spring Service layer.
*/
public class PolymorphismRealWorldDemo {
 
    interface PaymentService {
        void pay(double amount);
    }
 
    static class CreditCardPayment implements PaymentService {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }
 
    static class UpiPayment implements PaymentService {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using UPI");
        }
    }
 
    public static void main(String[] args) {
        PaymentService service;
 
        service = new CreditCardPayment();
        service.pay(5000);
 
        service = new UpiPayment();
        service.pay(2000);
    }
}