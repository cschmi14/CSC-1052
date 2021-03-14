
public class P2Tester {
	public static void main(String[] args) {
		
		RecursionProject2 test = new RecursionProject2();
		/*
		 * System.out.println(test.powerN(2, 5));
		 * System.out.println(test.reverseString("hello"));
		 */
		int[] arr = {11,11,12,13,11,11};
		System.out.println(test.array11(arr,2));
		System.out.println(test.countToBy(25, 4));
		System.out.println(test.isSimplePalindrome("racecar"));
		System.out.println(test.stringClean("hhhowwddyyyy"));
		System.out.println(test.fibonacci(1));
		System.out.println(test.zigzag(3));
		System.out.println(test.evenDigits(718239714));
	}
}
