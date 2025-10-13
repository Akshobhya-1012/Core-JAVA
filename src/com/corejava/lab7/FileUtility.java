package com.corejava.lab7;
 
import java.io.*;
import java.util.*;
 
public class FileUtility {
    public static List<String> readFile(String filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }
 
    public static Document parseDocument(String line) {
        String[] parts = line.split(",");
        if (parts.length != 3) return null;
        try {
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            String desc = parts[2].trim();
            return new Document(id, name, desc);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}