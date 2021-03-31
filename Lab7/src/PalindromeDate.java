/**
 * 
 * @author Carter Schmidt
 *
 */


public class PalindromeDate {
	
	
	/**
	 * 
	 * @param date is in the format of MMDDYYYY
	 * @return return true if the date is palindrome
	 */
	public static boolean test(String date) {
		int length = date.length();
		char currChar;
		ArrayBoundedQueue<Character> dateQueue = new ArrayBoundedQueue<Character>(length);
		ArrayBoundedStack<Character> dateStack = new ArrayBoundedStack<Character>(length);
		for (int i = 0; i < length; i++) {
			currChar = date.charAt(i);
			dateQueue.enqueue(currChar);
			dateStack.push(currChar);
		}
		boolean different = false;
		char stackChar;
		char queueChar;
		while (!(dateStack.isEmpty() || different)) {
			stackChar = dateStack.top();
			dateStack.pop();
			queueChar = dateQueue.dequeue();
			if (stackChar != queueChar) {
				different = true;
			}		
		}
		return !different;
	}
	
	/**
	 * This method is going to print all palindrome dates between start year and end year.
	 * The date will be print in the format of MMDDYYYY
	 * 
	 * @param startYear The String starting year
	 * @param endYear The String ending year
	 */
	public static void print(int startYear, int endYear) {
		int days;
		String month;
		String day;
		String fullDate;
		//if statements check to see how many days are in the month since each month has a different number of days.
		for (int y = startYear; y <= endYear; y++) {
			for (int m = 1; m < 13; m++) {
				if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
					days = 31;
				}
				else if (m == 4 || m == 6 || m == 9 || m == 11) {
					days = 30;
				}
				else {
					days = 28;
				}
				for (int d = 1; d < days; d++) {
					if (m < 10) {
						month = "0" + m;
					}
					else {
						month = Integer.toString(m);
					}
					if (d < 10) {
						day = "0" + d;
					}
					else {
						day = Integer.toString(d);
					}
					fullDate = month + day + Integer.toString(y);
					if (test(fullDate)) {
						System.out.println(fullDate);
					}
				}
			}
		}
	}

}