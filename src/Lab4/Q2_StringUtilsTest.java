package Lab4;

import java.util.Scanner;
 
public class Q2_StringUtilsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtil util = new StringUtil();
 
        System.out.print("Enter URL: ");
        String url = scanner.nextLine();
 
        String command = util.getCommand(url);
 
        System.out.println("Command: " + command);
 
        scanner.close();
    }
}
 