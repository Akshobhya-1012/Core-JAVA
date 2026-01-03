package com.corejava.lab7;
import java.util.*;
 
public class Q2_Set_HashSetFindDuplicate {
    public static void main(String[] args) {
        String names[] = {
            new String("pankaj"),
            new String("rajesh"),
            new String("suresh"),
            new String("pankaj")
        };
 
       
        System.out.println("-----Initial list-------");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
 
       
        Set<String> nameSet = new HashSet<String>();
        Set<String> duplicates = new HashSet<String>();
 
        for (int i = 0; i < names.length; i++) {
            if (!nameSet.add(names[i])) {
                duplicates.add(names[i]);
            }
        }
 
        
        for (String dup : duplicates) {
            System.out.println("Duplicate name detected : " + dup);
        }
 
        
        System.out.println(nameSet.size() + " distinct words detected : list : " + nameSet);
    }
}