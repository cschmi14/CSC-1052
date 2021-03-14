import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecursionMethodsTest {
	
	RecursionProject2 recursionP2;	
	
	@BeforeEach
	public void setUp() {
		
		recursionP2 = new RecursionProject2();
	        
	}
	
	@Test
	void testPowerN1() {
		assertEquals(3, recursionP2.powerN(3,1));
	}
	
	@Test
	void testPowerN2() {
		assertEquals(9, recursionP2.powerN(3,2));
	}
	
	@Test
	void testPowerN3() {
		assertEquals(27, recursionP2.powerN(3,3));
	}
	
	@Test
	void testPowerN4() {
		assertEquals(10, recursionP2.powerN(10,1));
	}
	
	@Test
	void testPowerN5() {
		assertEquals(100, recursionP2.powerN(10,2));
	}
	
	@Test
	void testPowerN6() {
		assertEquals(1000, recursionP2.powerN(10,3));
	}
	
	@Test
	void testPowerN7() {
		assertEquals(32, recursionP2.powerN(2,5));
	}

		
	@Test
    public void testReverseString1() {
		String s = "This1 is2 a3 string4";
	    assertEquals("4gnirts 3a 2si 1sihT", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString2() {
		String s = "kayak";
	    assertEquals("kayak", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString3() {
		String s = "Algo 1052";
	    assertEquals("2501 oglA", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString4() {
		String s = "Recursion rocks, haha";
	    assertEquals("ahah ,skcor noisruceR", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString5() {
		String s = "XyZaabbcc123";
	    assertEquals("321ccbbaaZyX", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString6() {
		String s = "Blockchain";
	    assertEquals("niahckcolB", recursionP2.reverseString(s));
	}
	
	@Test
    public void testReverseString7() {
		String s = "Driverless cars";
	    assertEquals("srac sselrevirD", recursionP2.reverseString(s));
	}

	
	  @Test void testcountToBy() { assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10",
	  recursionP2.countToBy(10,1)); }
	  
	  @Test void testcountToBy2() { assertEquals("1, 5, 9, 13, 17, 21, 25",
	  recursionP2.countToBy(25,4)); }
	  
	  @Test void testcountToBy3() { assertEquals("2, 6, 10, 14, 18, 22, 26, 30",
	  recursionP2.countToBy(30,4)); }
	  
	  @Test void testcountToBy4() { assertEquals("4, 9, 14, 19, 24, 29, 34",
	  recursionP2.countToBy(34,5)); }
	  
	  @Test void testcountToBy5() { assertEquals("3", recursionP2.countToBy(3,6));
	  }
	  
	  @Test void testcountToBy6() { assertEquals("2, 5, 8, 11, 14, 17",
	  recursionP2.countToBy(17,3)); }
	  
	  @Test void testevenDigits1() { assertEquals(8426,
	  recursionP2.evenDigits(8342116)); }
	  
	  @Test void testevenDigits2() { assertEquals(0,
	  recursionP2.evenDigits(35179)); }
	  
	  @Test void testevenDigits3() { assertEquals(24,
	  recursionP2.evenDigits(1234)); }
	  
	  @Test void testevenDigits4() { assertEquals(666,
	  recursionP2.evenDigits(779991666)); }
	  
	  @Test void testevenDigits5() { assertEquals(2, recursionP2.evenDigits(7123));
	  }
	  
	  @Test void testevenDigits6() { assertEquals(2666,
	  recursionP2.evenDigits(771237666)); }
	  
	  @Test void testevenDigits7() { assertEquals(0,
	  recursionP2.evenDigits(777777)); }
	  
	  @Test public void testArray111() { int[] a = {11,1,3,4,}; assertEquals(1,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray112() { int[] a = {11,11}; assertEquals(2,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray113() { int[] a = {1,3,4,5}; assertEquals(0,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray114() { int[] a = {11}; assertEquals(1,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray115() { int[] a = {1}; assertEquals(0,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray116() { int[] a = {}; assertEquals(0,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testArray117() { int[] a = {11,1,3,4,11,5}; assertEquals(2,
	  recursionP2.array11(a, 0)); }
	  
	  @Test public void testzigzag1() { assertEquals("<**>",
	  recursionP2.zigzag(4)); }
	  
	  @Test public void testzigzag2() { assertEquals("<<*>>",
	  recursionP2.zigzag(5)); }
	  
	  @Test public void testzigzag3() { assertEquals("<<**>>",
	  recursionP2.zigzag(6)); }
	  
	  @Test public void testzigzag4() { assertEquals("<<<*>>>",
	  recursionP2.zigzag(7)); }
	  
	  @Test public void testzigzag5() { assertEquals("<<<**>>>",
	  recursionP2.zigzag(8)); }
	  
	  @Test public void testzigzag6() { assertEquals("<<<<*>>>>",
	  recursionP2.zigzag(9)); }
	  
	  @Test public void testzigzag7() { assertEquals("<<<<**>>>>",
	  recursionP2.zigzag(10)); }
	  
	  @Test public void testIsSimplePalindrome1() { String s = "madam";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome2() { String s = "madam2";
	  assertEquals(false, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome3() { String s = "racecar";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome4() { String s = "palindrome";
	  assertEquals(false, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome5() { String s = "repaper";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome6() { String s = "paper";
	  assertEquals(false, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome7() { String s = "kayak";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome8() { String s = "";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testIsSimplePalindrome9() { String s = "g";
	  assertEquals(true, recursionP2.isSimplePalindrome(s)); }
	  
	  @Test public void testStringClean1() { String s = "yyzzza";
	  assertEquals("yza", recursionP2.stringClean(s)); }
	  
	  @Test public void testnonMatching2() { String s = "Hello";
	  assertEquals("Helo", recursionP2.stringClean(s)); }
	  
	  @Test public void testnonMatching3() { String s = "abbbcdd";
	  assertEquals("abcd", recursionP2.stringClean(s)); }
	  
	  @Test public void testStringClean4() { String s = "XXabcYY";
	  assertEquals("XabcY", recursionP2.stringClean(s)); }
	  
	  @Test public void testStringClean5() { String s = "hi"; assertEquals("hi",
	  recursionP2.stringClean(s)); }
	  
	  @Test public void testFibonacci1() { assertEquals(0,
	  recursionP2.fibonacci(0)); }
	  
	  @Test public void testFibonacci2() { assertEquals(1,
	  recursionP2.fibonacci(1)); }
	  
	  @Test public void testFibonacci3() { assertEquals(1,
	  recursionP2.fibonacci(2)); }
	  
	  @Test public void testFibonacci4() { assertEquals(2,
	  recursionP2.fibonacci(3)); }
	  
	  @Test public void testFibonacci5() { assertEquals(3,
	  recursionP2.fibonacci(4)); }
	  
	  @Test public void testFibonacci6() { assertEquals(5,
	  recursionP2.fibonacci(5)); }
	  
	  @Test public void testFibonacci7() { assertEquals(8,
	  recursionP2.fibonacci(6)); }
	  
	  @Test public void testFibonacci8() { assertEquals(13,
	  recursionP2.fibonacci(7)); }
	 
}
