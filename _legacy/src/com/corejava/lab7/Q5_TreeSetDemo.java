package com.corejava.lab7;
import java.util.TreeSet;
 
public class Q5_TreeSetDemo {
    public static void main(String[] args) {
        
        TreeSet<String> stringSet = new TreeSet<>();
        stringSet.add("Banana");
        stringSet.add("Apple");
        stringSet.add("Orange");
        stringSet.add("Banana");
 
        System.out.println("TreeSet of Strings (sorted):");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
 
        System.out.println("\n-----------------------\n");
 
        
        TreeSet<Integer> integerSet = new TreeSet<>();
        integerSet.add(30);
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30); 
 
        System.out.println("TreeSet of Integers (sorted):");
        for (Integer number : integerSet) {
            System.out.println(number);
        }
    }
}