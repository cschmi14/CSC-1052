/**
 * ArrayProcessing performs common algorithms on arrays like searching and finding the max, min, and average
 * It also prints the array with each element on a new line or comma delimited 
 * @author kathl
 *
 */

public class ArrayProcessing {

	/**
	 * Find the maximum element in an array of integers
	 * @param a the array
	 * @return the maximum element
	 */
	public int findMax(int[] a) {
		int max = 0;
		int compare = 0;
		for (int i = 0; i < a.length; i++) {
			compare = a[i];
			if (compare > max) {
				max = compare;
			}
		}
		return max;
	}
	
	/**
	 * Find the minimum element in an array of integers
	 * @param a the array
	 * @return the minimum
	 */
	public int findMin(int[] a) {	
		int min = a[0];
		int compare = 0;
		for (int i = 1; i < a.length; i++) {
			compare = a[i];
			if (compare < min) {
				min = compare;
			}
		}
		return min;
		
	}
	
	/**
	 * Find the average value of an array of integers
	 * @param a the array 
	 * @return the average
	 */
	public int findAverage(int[]a) {
		int avg;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		return avg;	
		
	}
	
	/**
	 * Searched the array for a given target
	 * @param a the array
	 * @param target the target value to find
	 * @return true if value is found, false otherwise
	 */
	public boolean search(int[] a, int target) {
		boolean t = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				t = true;
			}
		}
		return t;
	}
	
	/**
	 * Prints each element of the array on a separate new line	
	 * @param a the array to print
	 */
	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	/**
	 * Prints each element of the array separated by a comma
	 * array {5, 10 ,20} would print as 5,10,20
	 * @param a the array
	 */
	public void printCommaDelimitedArray(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + ",");
		}		
		System.out.print(a[a.length - 1]);
	}
}