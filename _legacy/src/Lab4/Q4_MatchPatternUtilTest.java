package Lab4;

import java.util.Arrays;
 
public class Q4_MatchPatternUtilTest {
    public static void main(String[] args) {
 
        String input1 = "abaaaba";
        System.out.println("matchabSequence: " + Arrays.toString(MatchPatternUtil.matchabSequence(input1))); // Expected: [0, 4]
 
        String input2 = "a12c3e456f";
        System.out.println("findDigitLocation: " + Arrays.toString(MatchPatternUtil.findDigitLocation(input2))); // Expected: [1, 2, 4, 5, 6, 8]
 
        String input3 = "a 1 56 _Z";
        System.out.println("findWhiteSpaces: " + Arrays.toString(MatchPatternUtil.findWhiteSpaces(input3))); // Expected: [1, 3, 6]
 
        String input4 = "12 0x 0x12 0Xf 0Xg";
        System.out.println("findPattern: " + Arrays.toString(MatchPatternUtil.findPattern(input4))); // Expected: [6, 11]
    }
}
 