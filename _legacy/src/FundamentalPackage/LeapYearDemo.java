package FundamentalPackage;

public class LeapYearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2024;
		boolean leap = false;
//		If the year is devisible by 4
		if(year%4==0) {
			if(year%100==0) {
				if (year%400==0) 
					leap =true;
				else leap = false;
			}
			else leap = true;
		}
		else leap = false;
		
		if(leap)
		System.out.println("year"+ year +"is a leap year");
		else 
			System.out.println("year" + year + "is not a leap year");
	}

}
