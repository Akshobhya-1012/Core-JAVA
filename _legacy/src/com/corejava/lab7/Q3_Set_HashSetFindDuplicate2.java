package com.corejava.lab7;
import java.util.*;
 
public class Q3_Set_HashSetFindDuplicate2 {
    public static void main(String[] args) {
       
        String names[] = {
            new String("pankaj"),
            new String("rajesh"),
            new String("suresh"),
            new String("pankaj"),
            new String("suresh"),
            new String("aman")
        };
 
        System.out.println("-----Initial list-------");
        for (int i = 0; i < names.length; i++) {
            if (i != names.length - 1)
                System.out.print(names[i] + ", ");
            else
                System.out.print(names[i]);
        }
 
        
        Set<String> allNames = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        List<String> uniqueNames = new ArrayList<>();
 
        for (String name : names) {
            if (!allNames.add(name)) {
                duplicates.add(name);
            }
        }
 
        
        for (String name : allNames) {
            if (!duplicates.contains(name)) {
                uniqueNames.add(name);
            }
        }
 
        System.out.println();
        System.out.println("unique names : " + uniqueNames);
        System.out.println("duplicate names : " + duplicates);
    }
}