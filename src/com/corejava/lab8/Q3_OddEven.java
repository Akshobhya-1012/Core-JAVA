package com.corejava.lab8;

public class Q3_OddEven {
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            System.out.println("Even Numbers (1 to 20):");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        });
 
        Thread oddThread = new Thread(() -> {
            System.out.println("Odd Numbers (1 to 20):");
            for (int i = 1; i <= 20; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        });
 
        try {
            evenThread.start();
            evenThread.join(); 
 
            oddThread.start();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}