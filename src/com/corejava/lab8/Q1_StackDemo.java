package com.corejava.lab8;

public class Q1_StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
 
        
        Thread pushThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                stack.push(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
 
        
        Thread popThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                stack.pop();
                try {
                    Thread.sleep(150); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
 
        pushThread.start();
        popThread.start();
    }
}