//@author Carter Schmidt
public class MyArrayList<T> implements ListInterface<T>{

	T[] arr = (T[]) new Object[DEFAULT_CAPACITY];
	
	/**
	 * Adds an element to the list, keeping the order of the list in tact
	 * Enlarge array when full
	 * @param t element to add
	 */
	
	public void add(T t) {
		//element is used to check for null values
		T element;
		//check for empty array, make it array of length 1 if it is
		if (arr.length > 0) {
			element = arr[0];
		}
		else {
			T[] arr1 = (T[]) new Object[arr.length + 1];
			arr = arr1;
			element = arr[0];
		}
		boolean full = true;
		//if not full, then a null value is present and is replaced with t
		for (int i = 0; i < arr.length; i++) {
			
			element = arr[i];
			if (element == null) {
				arr[i] = t;
				full = false;
			}
		//if full, the array is copied to an enlarged array and t is added to the end
		}
		if (full) {
			T[] arr2 = (T[]) new Object[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {				
				element = arr[i];
				arr2[i] = element;
			}
			arr2[arr.length] = t;
			arr = arr2;
		}
		
		
	}
	
	/**
	 * Gets element at position
	 * @param pos in list to get element
	 * @return element at position
	 * @throws MyIndexOutOfBoundsException - if attempt to get an element outside of
	 * the current elements in the array. For example, if there are 2 elements in
	 * the array and attempt to get(3).
	 * @throws ArrayIndexOutOfBoundsException - if attempt to get element at a 
	 * position larger than the array size.
	 */
	public T get(int pos) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
		if (pos >= arr.length || pos < 0) {
			throw new MyIndexOutOfBoundsException();
		}
		else {
			return arr[pos];
		}
		
		
	}
		
	/**
	 * Finds and removes the first occurrence of the element from list, keeping the order of the list in tact
	 * @param t element to remove
	 * @return true if item is successfully removed, otherwise return false
	 */
	public boolean remove(T t) {
		//copy array to shorter array, and don't copy the element at index where t is found
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] == t) {
				T[] arr2 = (T[]) new Object[arr.length - 1];
					for (int i = 0, j = 0; i < arr.length; i++) {
						if (i != k)
						    arr2[j++] = arr[i];
					}
				arr = arr2;
				return true;
			}	
		}
		return false;
	}
	
	/**
	 * Removes element at given position, keeping the order of the list in tact
	 * @param pos
	 * @throws MyIndexOutOfBoundsException - if attempt to remove an element outside of
	 * the current elements in the array. For example, if there are 2 elements in
	 * the array and attempt to remove(3).
	 * @throws ArrayIndexOutOfBoundsException - if attempt to remove element at 
	 * at position larger than the array size.
	 */
	public void remove(int pos) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
		//copy array to shorter array, and don't copy the element at index pos on original array
		if (pos >= arr.length || pos < 0) {
			throw new MyIndexOutOfBoundsException();
		}
		else {
			T[] arr2 = (T[]) new Object[arr.length - 1];
				for (int i = 0, j = 0; i < arr.length; i++) {
					if (i != pos)
					    arr2[j++] = arr[i];
				}
			arr = arr2;
		}
	}
	
	/**
	 * Inserts element at given position, keeping the order of the list in tact
	 * @param pos position in list to add element
	 * @param t element to add
	 * @throws MyIndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
	 * @throws ArrayIndexOutOfBoundsException - if attempt to add element at 
	 * at position larger than the array size.
	 */
	public void add(int pos, T t) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
		//element used copy values from array to array
		T element;
		//check for empty array, make it array of length 1 if it is
		if (arr.length > 0) {
			element = arr[0];
		}
		else {
			T[] arr1 = (T[]) new Object[arr.length + 1];
			arr = arr1;
			element = arr[0];
		}
		
		//check if valid pos
		if (pos > arr.length || pos < 0) {
			throw new MyIndexOutOfBoundsException();
		}
		
		else {
		//make new array and copy values until pos, then add t, then continue copying
			T[] arr2 = (T[]) new Object[arr.length + 1];
			for (int i = 0, j = 0; i < arr.length; i++, j++) {				
				element = arr[i];
				if (j == pos) {
					arr2[j] = t;
					i--;
				}
				else {
					arr2[j] = element;
				}
			}
			arr = arr2;
			
		}
		
	}
	
	/**
	 * Replaces element at given position in the list with the given element
	 * @param pos position in list to replace element
	 * @param t element to set
	 * @throws MyIndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
	 * @throws ArrayIndexOutOfBoundsException - if attempt to set element at 
	 * at position larger than the array size.
	 */
	public void set(int pos, T t) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException {
		//element used to check for null values
		T element = arr[0];
		if (pos > arr.length || pos < 0) {
			throw new MyIndexOutOfBoundsException();
		}
		else {
			//if pos is equal to arr.length, copy array to bigger array and add t to end of new array
			if (pos == arr.length) {
				T[] arr2 = (T[]) new Object[arr.length + 1];
				for (int i = 0; i < arr.length; i++) {				
					element = arr[i];
					arr2[i] = element;
				}
				arr2[pos] = t;
				arr = arr2;
			}
			//if pos < arr.length, simply set element at index pos to t
			else {
				arr[pos] = t;
			}
		}
	}
	
	/**
	 * Checks if element is in list
	 * @param t element to search for
	 * @return true if it is, otherwise returns false
	 */
	public boolean contains(T t) {
		
		for (Integer i = 0; i < arr.length; i++) {
			if (arr[i] == t) {
				return true;
			}
		}
		return false;
		
	}
	

	/**
	 * Size of the list
	 * @return the number of elements in the list
	 */
	public int size() {
		
		return arr.length;
		
	}
	
	/**
	 * Remove all elements from list
	 */
	public void clear() {
		
		T[] arr2 = (T[]) new Object[1];
		arr = arr2;
		
	}
	
	/**
	 * Check if list is empty
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		
		if (arr.length == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}

