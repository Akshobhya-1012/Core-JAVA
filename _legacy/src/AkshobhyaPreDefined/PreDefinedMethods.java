package AkshobhyaPreDefined;
public class PreDefinedMethods {
 
    
    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
 
        
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
 
            start++;
            end--;
        }
 
        return new String(chars);
    }
    
    public static String customSubstring(String input, int start, int end) {
        if (start < 0 || end > input.length() || start > end) {
            return "Invalid input";
        }
 
        String result = "";
        for (int i = start; i < end; i++) {
            result += input.charAt(i);
        }
 
        return result;
    }
}