package Lab4;

public class StringExercises {
 
    public static int findMarc(String string) {
        if (string == null) return -2;
        return string.indexOf("Marc");
    }
 
    public static int findSubstring(String string, String substring) {
        if (string == null || substring == null) return -2;
        return string.indexOf(substring);
    }
 
    public static boolean contains(String string, String substring) {
        if (string == null || substring == null) return false;
        return string.contains(substring);
    }
 
    public static String[] splitIntoWords(String string) {
        if (string == null) return null;
        return string.split("\\s+");
    }
 
    public static String firstFour(String string) {
        if (string == null || string.length() < 4) return null;
        return string.substring(0, 4);
    }
 
    public static String firstN(String string, int n) {
        if (string == null || string.length() < n) return null;
        return string.substring(0, n);
    }
 
    public static String lastFour(String string) {
        if (string == null || string.length() < 4) return null;
        return string.substring(string.length() - 4);
    }
 
    public static String lastN(String string, int n) {
        if (string == null || string.length() < n || n < 0) return null;
        return string.substring(string.length() - n);
    }
}