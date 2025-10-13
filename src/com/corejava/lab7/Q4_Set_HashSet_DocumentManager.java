package com.corejava.lab7;
 
import java.io.File;
import java.util.*;
 
public class Q4_Set_HashSet_DocumentManager {
    public static void main(String[] args) {
    	File file = new File("docs.txt");
    	System.out.println(file.getAbsolutePath());
        String filename = "D:\\Core Java\\ProgrammingFundamentals\\src\\com\\corejava\\lab7\\docs.txt";
        List<String> lines = FileUtility.readFile(filename);
 
        System.out.println("Lines read from file:");
        for (String line : lines) {
            System.out.println(line);
        }
 
        Set<Document> docSet = new HashSet<>();
        List<Document> duplicates = new ArrayList<>();
 
        for (String line : lines) {
            Document doc = FileUtility.parseDocument(line);
            if (doc == null) continue;
 
            if (!docSet.add(doc)) {
                duplicates.add(doc);
            }
        }
 
        System.out.println("\nDuplicate Documents:");
        for (Document d : duplicates) {
            System.out.println(d);
        }
 
        System.out.println("\nDistinct Documents:");
        for (Document d : docSet) {
            System.out.println(d);
        }
    }
}