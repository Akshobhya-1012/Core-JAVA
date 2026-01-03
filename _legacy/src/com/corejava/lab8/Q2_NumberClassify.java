package com.corejava.lab8;
import java.util.Random;
 
public class Q2_NumberClassify {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random rand = new Random();
 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101) - 50;
        }
 
        System.out.println("Generated Numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
 
        
        Thread negativeThread = new Thread(() -> {
            System.out.println("Negative Numbers:");
            for (int n : numbers) {
                try {
                    if (n < 0) {
                        System.out.print(n + " ");
                    }
                } catch (Exception e) {
                    System.out.println("Error in negativeThread: " + e.getMessage());
                }
            }
            System.out.println();
        });
 
        
        Thread evenThread = new Thread(() -> {
            System.out.println("Positive Even Numbers:");
            for (int n : numbers) {
                try {
                    if (n > 0 && n % 2 == 0) {
                        System.out.print(n + " ");
                    }
                } catch (Exception e) {
                    System.out.println("Error in evenThread: " + e.getMessage());
                }
            }
            System.out.println();
        });
 

        Thread oddThread = new Thread(() -> {
            System.out.println("Positive Odd Numbers:");
            for (int n : numbers) {
                try {
                    if (n > 0 && n % 2 != 0) {
                        System.out.print(n + " ");
                    }
                } catch (Exception e) {
                    System.out.println("Error in oddThread: " + e.getMessage());
                }
            }
            System.out.println();
        });
 
        
        negativeThread.start();
        evenThread.start();
        oddThread.start();
    }
}