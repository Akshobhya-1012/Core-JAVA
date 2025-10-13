package com.corejava.lab8;

class Stack {
    private int[] stackArray;
    private int top;
    private int capacity;
 
    public Stack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        top = -1;
    }
 
    public synchronized void push(int value) {
        while (top == capacity - 1) {
            try {
                System.out.println("Stack is full. Waiting to push...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
        notifyAll(); 
    }
 
    public synchronized int pop() {
        while (top == -1) {
            try {
                System.out.println("Stack is empty. Waiting to pop...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        int value = stackArray[top--];
        System.out.println("Popped: " + value);
        notifyAll();
        return value;
    }
}