package Lab4;
public class StringUtil {
 
    public String getCommand(String url) {
        if (url == null || !url.contains("/")) {
            return "";
        }
 
        
        String[] parts = url.split("/");
        String lastPart = parts[parts.length - 1];
        
        if (lastPart.contains(".")) {
            lastPart = lastPart.substring(0, lastPart.lastIndexOf('.'));
        }
 
        return lastPart;
    }
}