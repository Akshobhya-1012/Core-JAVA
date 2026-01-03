package com.corejava.lab7;
 
import java.util.HashMap;
import java.util.Map;
 
public class Q6_Map_HashMap {
 
    @SuppressWarnings("removal")
	private static final Integer ONE = new Integer(1);
 
    public static void main(String[] args) {
        
        String name[] = {
            new String("pankaj"),
            new String("rajesh"),
            new String("pankaj"),
            new String("deepak"),
            new String("pankaj")
        };
 
        
        Map<String, Integer> wordMap = new HashMap<>();
 
        for (String word : name) {
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word) + 1;
                wordMap.put(word, count);
                System.out.println("frequency of :" + word + " is : " + count);
            } else {
                wordMap.put(word, ONE);
                System.out.println("frequency of :" + word + " is : " + ONE);
            }
        }
 
        
        System.out.println(wordMap.size() + " distinct word detected");
 
       
        System.out.println(wordMap);
    }
}