package FundamentalPackage;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1234567;
		int reversednumber = reverseNumber(number);
		System.out.println("The reversed number of "+ number + " is "+reversednumber);
	}

	private static int reverseNumber(int number) {
		// TODO Auto-generated method stub
		int reversed =0;
		while(number!=0) {
			int digit = number%10;
			reversed = reversed*10 +digit;
			number = number/10;
			
		}
		return reversed;
	}

}
