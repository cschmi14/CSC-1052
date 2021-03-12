//@author Carter Schmidt
public class Palindrome {

	/**
	 * 
	 * @param s is a string mixed with letter and non-letter characters
	 * @return true if s is a palindrome
	 */
	public boolean palidromeRecur(String s) {
		//if the String has 1 or less characters, then true because it is palindrome
		if (s.length() < 2) {
			return true;
		}

		else {
			/*
			 *if the first and last characters are the same, remove them and call the method
			 *again with the modified string s
			 */
			if (s.charAt(0) == s.charAt(s.length() - 1)) {
				s = s.substring(1, s.length() - 1);
				return palidromeRecur(s);
			}
			/*check for non-lowercase-letter chars with ascii table values:
			 * if the first char is not a lowercase letter, remove it with substring
			 * and run the method again
			 * if the last char is not a lowercase letter, remove it with substring
			 * and run the method again
			 */
			else if (s.charAt(0) < 97 || s.charAt(0) > 124) {
				s = s.substring(1);
				return palidromeRecur(s);
			}
			else if (s.charAt(s.length() - 1) < 97 || s.charAt(s.length() - 1) > 124) {
				s = s.substring(0, s.length() - 1);
				return palidromeRecur(s);
			}
		}
		/*if enough characters are not removed through recursion to
		 * make the str a palindrome (1 or 0 characters), then the
		 * String s must not be a palindrome.
		 */
		return false;
	}


	/**
	 * 
	 * @param s is a string mixed with letter and non-letter characters
	 * @return true if s is a palindrome
	 */
	public boolean palidromeIter(String s) {	
		//create new String str with only the lowercase characters from s
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 96 && s.charAt(i) < 123) {
				str += s.charAt(i);
			}
		}

		/*Loop as long as the str is more than 1 character since if it has 1 or 0 characters 
		 * then it is a palindrome.
		 * If the first and last chars are the same, remove them and loop again until it has
		 * less than 2 characters (assuming it is a palindrome this will happen eventually).
		 * However, if these first and last chars are not the same, 
		 * then the string is not a palindrome and returns false.
		 */
		for (int i = 0; str.length() > 1; i++) {
			if (str.charAt(0) == str.charAt(str.length() - 1)) {
				str = str.substring(1, str.length() - 1);
			}
			else {
				return false;
			}
		}
		//return true if it passes the above loop test
		return true;
	}

}
