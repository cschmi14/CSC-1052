package custom;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * MyCustomIntegerArray represents an array of integers. 
 * @author Your Name
 *
 */
public class MyCustomIntegerArray {
	
	//TO DO: declare integer array instance variable
	int[] array;
	/**
	 * Constructor takes an array and initializes the integer array 
	 * instance variable with it
	 * @param a
	 */
	public MyCustomIntegerArray(int[] a) {
		array = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[i];
		}
	}

	/**
	 * Change the encapsulated array
	 * @param newIntArray
	 */
	public void setMyIntArray(int[] newIntArray) {
		array = newIntArray;
	}
	
	/**
	 * Increments each element of the array by d
	 * @param d value to increment each element of array by
	 * For example, the call incEachElement(5) would change
	 * array {2,3,4} to {7,8,9}
	 */
	public void incEachElement(int d) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + d;
		}
	}
	
	/**
	 * Increments the element at the given index by d
	 * If the index is out of bounds of the array, method does nothing
	 * @param index 
	 * @param d
	 * For example, the call incElementAt(2,6) would change array {5,6,3,4}
	 * to {5,6,9,4}
	 */
	public void incElementAt(int index, int d) {
		array[index] = array[index] + d;
	}
	
	/**
	 * Reverses the order of the array
	 * For example, array {1,2,3,4} would become {4,3,2,1}
	 */
	public void reverseArrayOrder() {
		int j = array.length - 1;
		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}
		for (int i = 0; i < array.length; i++, j--) {
			array[i] = copy[j];
		}
		
	}
	
	/**
	 * Remove element at given index and shrink length of array keeping the order of the
	 * array in tact. In other words, there should be no trailing integers at the end of 
	 * the array or holes in the array.
	 * For example, after call removeElement(2) array {1,3,5,7,9} of length 5
	 * would become {1,3,7,9} length 4. Notice the order of the elements remained
	 * the same.
	 * Note: you will need to create a new temporary array with a new length and copy
	 * the new elements to it. You will then assign myIntArray to the temp array
	 * 
	 * @param index the index of element to remove
	 */
	
	public void removeElement(int index) {
		int[] arrayNew = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != index)
			    arrayNew[j++] = array[i];
		}
		array = arrayNew;
	}
	
	/**
	 * Starting from the beginning of the array, method checks for duplicates.
	 * If a duplicate exists, method deletes the duplicate element and leaves
	 * the first instance of the element. The order of the array should be kept in tact.
	 * For example array {1,5,6,7,7,8,5} would become {1,5,6,7,8}
	 * 
	 * Length of array must shrink each time a duplicate is removed. In other
	 * words, there should be no trailing integers at the end of the array or holes in the array. 
	 * Array length should shrink from 7 to 5 in the above example.
	 * Hint: search for duplicate elements and use the removeElement(int index) method above 
	 * to remove duplicates after they are found.
	 */
	public void removeDuplicates() {		
		int test;
		
		for (int i = 0; i < array.length; i++) {
			test = array[i];
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == test)
					removeElement(j);
			}
		}
		
	}
	
	/**
	 * Returns a comma delimited version of the array
	 * For example, array {1,3,5,6} would be printed as 1,3,5,6
	 * You must return a String, so you should convert the integers to a String
	 * using Integer.toString(int i) method.
	 * @return the comma delimited array as a String
	 */
	public String toString() {
		String arStr = "";
		for (int i = 0; i < array.length; i++) {
			arStr = arStr + array[i];
			if (i < array.length - 1)
			    arStr = arStr + ",";
		}
		return arStr;
		
	}
}
