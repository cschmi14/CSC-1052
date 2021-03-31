/**
 * 
 * @author Carter Schmidt
 *
 */
public class DynamicAverage {
	
	/**
	 *  Constructor
	 * @param size
	 */
	protected ArrayBoundedQueue<Integer> window;
	protected int length;
	
	public DynamicAverage(int size) {
		window = new ArrayBoundedQueue<Integer>(size);
		length = size;
	}
	
	/**
	 * 
	 * @param val scanning the next variable val and return the dynamic average
	 * @return return the dynamic average in window
	 */
	public double next(int val) {
        if (window.isFull()) {
        	window.dequeue();
        }
		window.enqueue(val);
		ArrayBoundedQueue<Integer> copy = new ArrayBoundedQueue<Integer>(length);
		int sum = 0;
		int currNum = 0;
		while (!window.isEmpty()) {
			currNum = window.dequeue();
			copy.enqueue(currNum);
			sum += currNum;
		}
		window = copy;
		return (double)sum / window.size();
        
    }

}
