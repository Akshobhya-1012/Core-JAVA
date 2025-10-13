package Lab4;

public class MatchPatternUtil {
 
    public static int[] matchabSequence(String str) {
        int count = 0;
 
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                count++;
            }
        }
 
        int[] indices = new int[count];
        int index = 0;
 
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                indices[index++] = i;
            }
        }
 
        return indices;
    }
 
    public static int[] findDigitLocation(String str) {
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
 
        int[] indices = new int[count];
        int index = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                indices[index++] = i;
            }
        }
 
        return indices;
    }
 
    public static int[] findWhiteSpaces(String str) {
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
 
        int[] indices = new int[count];
        int index = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                indices[index++] = i;
            }
        }
 
        return indices;
    }
 
 
    public static int[] findPattern(String str) {
        int count = 0;
 
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '0' &&
                (str.charAt(i + 1) == 'x' || str.charAt(i + 1) == 'X') &&
                isValidHexChar(str.charAt(i + 2))) {
                count++;
            }
        }
 
        int[] indices = new int[count];
        int index = 0;
 
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '0' &&
                (str.charAt(i + 1) == 'x' || str.charAt(i + 1) == 'X') &&
                isValidHexChar(str.charAt(i + 2))) {
                indices[index++] = i;
            }
        }
 
        return indices;
    }
 
    
    private static boolean isValidHexChar(char c) {
        return (c >= '0' && c <= '9') ||
               (c >= 'a' && c <= 'f') ||
               (c >= 'A' && c <= 'F');
    }
}
 