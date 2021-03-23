
public class PanlindromeDateTester {

	public static void main(String[] args) {
		
		PalindromeDate p = new PalindromeDate();
		
		System.out.println("Year \"2002\": ");
		System.out.println("Expected Result: true");
		System.out.println("Test Result: " + p.test("2002"));
		System.out.println();
		
		System.out.println("Year \"2003\": ");
		System.out.println("Expected Result: false");
		System.out.println("Test Result: " + p.test("2003"));
		System.out.println();
		
		System.out.println("Year \"1991\": ");
		System.out.println("Expected Result: true");
		System.out.println("Test Result: " + p.test("1991"));
		System.out.println();
		
		System.out.println("Year \"1234\": ");
		System.out.println("Expected Result: false");
		System.out.println("Test Result: " + p.test("1234"));
		System.out.println();
		
		System.out.println("Year \"2002\": ");
		System.out.println("Expected Result: true");
		System.out.println("Test Result: " + p.test("2002"));
		System.out.println();
		
		/*
		 *  Expected results:
		 *  Year 2000 to 2100:
			print palindrome dates: 
			10022001
			01022010
			11022011
			02022020
			12022021
			03022030
			04022040
			05022050
			06022060
			07022070
			08022080
			09022090
		 */
		
		System.out.println("Year 2000 to 2100:");
		System.out.println("print palindrome dates: ");
		p.print(2000, 2100);		
		System.out.println();
		
		
	}

}
