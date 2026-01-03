package Lab4;
import java.util.Arrays;
 
public class Q3_StringExercisesTest {
    public static void main(String[] args) {
 
        
        String input1 = "My friend Marc is here.";
        System.out.println("findMarc: " + StringExercises.findMarc(input1)); 
 
       
        System.out.println("findSubstring: " + StringExercises.findSubstring("Hello Java World", "Java")); 
 
        
        System.out.println("contains: " + StringExercises.contains("Programming is fun", "fun")); 
 
        String sentence = "This is a test sentence.";
        String[] words = StringExercises.splitIntoWords(sentence);
        System.out.println("splitIntoWords: " + Arrays.toString(words)); 
        
        System.out.println("firstFour: " + StringExercises.firstFour("Akshobhya")); 
        System.out.println("firstN: " + StringExercises.firstN("Akshobhya", 5)); 
        System.out.println("lastFour: " + StringExercises.lastFour("Akshobhya")); 
        System.out.println("lastN: " + StringExercises.lastN("Akshobhya", 3)); 
    }
}