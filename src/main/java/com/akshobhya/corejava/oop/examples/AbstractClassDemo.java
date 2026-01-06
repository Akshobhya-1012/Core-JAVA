package com.akshobhya.corejava.oop.examples;

/**
 * Demonstrates abstraction using abstract class.
 */
public class AbstractClassDemo {

    abstract static class Vehicle {
        String brand;

        Vehicle(String brand) {
            this.brand = brand;
        }

        abstract void start();

        void showBrand() {
            System.out.println("Brand: " + brand);
        }
    }

    static class Car extends Vehicle {

        Car(String brand) {
            super(brand);
        }

        @Override
        void start() {
            System.out.println("Car starts with key");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car("Toyota");
        vehicle.showBrand();
        vehicle.start();
    }
}
