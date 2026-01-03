package FundamentalPackage;

public class Challenge3 {
	 
    public int calculateSum(int n) {
        int count = 0;
        int number = 1;
        int sum = 0;
 
        while (count < n) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
                count++;
            }
            number++;
        }
 
        return sum;
    }
 
    public static void main(String[] args) {
    	Challenge3 demo = new Challenge3();
        int n = 5;
        int result = demo.calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers divisible by 3 or 5 is: " + result);
    }
}
 