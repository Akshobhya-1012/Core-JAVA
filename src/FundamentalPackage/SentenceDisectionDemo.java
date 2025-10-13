package FundamentalPackage;

public class SentenceDisectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "This is the examp4le of the se3nt5ence disection";
		line = line.toLowerCase();
		int vowels, consonents, digits, whitespaces;
		vowels = totalVowels(line);
		consonents = totalconsonents(line);
		digits = totalDigits(line);
		whitespaces = totalWhiteSpaces(line);
		System.out.println(vowels+" "+consonents+" "+digits+" "+whitespaces);

	}

	
	private static int totalWhiteSpaces(String line) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<line.length();i++) {
			char ch = line.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		return count;
	}


	private static int totalDigits(String line) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<line.length();i++) {
			char ch = line.charAt(i);
			if(ch>='0' && ch<='9') {
				count++;
			}
		}
		return count;
	}

	private static int totalconsonents(String line) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int totalVowels(String line) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i=0; i<line.length();i++) {
			char ch = line.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}
		}
		return count;
	}

}
