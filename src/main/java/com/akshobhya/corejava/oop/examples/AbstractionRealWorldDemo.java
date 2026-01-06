package com.akshobhya.corejava.oop.examples;

/**
 * Real-world abstraction example similar to Spring Service layer.
 */
public class AbstractionRealWorldDemo {

    interface OrderService {
        void placeOrder();
    }

    static class OnlineOrderService implements OrderService {
        public void placeOrder() {
            System.out.println("Order placed through online service");
        }
    }

    static class StoreOrderService implements OrderService {
        public void placeOrder() {
            System.out.println("Order placed at physical store");
        }
    }

    public static void main(String[] args) {
        OrderService service;

        service = new OnlineOrderService();
        service.placeOrder();

        service = new StoreOrderService();
        service.placeOrder();
    }
}
