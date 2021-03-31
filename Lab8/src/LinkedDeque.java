/**
 * 
 * @author Carter Schmidt
 *
 * @param <T>
 */
public class LinkedDeque <T> implements DequeInterface <T>{
	private DLLNode<T> front;
	private DLLNode<T> rear;
	private int numElements = 0;

	LinkedDeque(){
		front = null;
		rear = null;
	}
	/**
	 * Adds an element to the front of the queue.
	 * @param element
	 * @throws QueueOverflowException if queue is full
	 * Note: we are implementing a linked deque so your queue will never throw 
	 * an QueueOverflowException
	 */
	@Override
	public void enqueueFront(T element) throws QueueOverflowException {
		DLLNode<T> newNode = new DLLNode<T>(element);
		if (numElements == 0) {
			rear = newNode;
			front = newNode;
		}
		else {
			newNode.setBack(front);
			front.setForward(newNode);
			front = newNode;
		}
		numElements++;
	}
	/**
     * Adds element to the rear of the queue.
     * @param element
     * @throws QueueOverflowException if queue is full
	 * Note: we are implementing a linked deque so your queue will never throw 
	 * an QueueOverflowException
     */
	@Override
	public void enqueueRear(T element) throws QueueOverflowException {
		DLLNode<T> newNode = new DLLNode<T>(element);
		if (numElements == 0) {
			rear = newNode;
			front = newNode;
		}
		else {
			newNode.setForward(rear);
			rear.setBack(newNode);
			rear = newNode;
		}
		numElements++;
	}

	@Override
	public T dequeueFront() throws QueueUnderflowException {
		if (numElements == 0) {
			throw new QueueUnderflowException("DequeueFront attempted on an empty Dequeue");
		}
		else {
			T info = front.getInfo();
			front = front.getBack();
			numElements--;
			return info;
		}
	}

	@Override
	public T dequeueRear() throws QueueUnderflowException {
		if (numElements == 0) {
			throw new QueueUnderflowException("DequeueFront attempted on an empty Dequeue");
		}
		else {
			T info = rear.getInfo();
			rear = rear.getForward();
			numElements--;
			return info;
		}
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (numElements == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {	
		return numElements;
	}
	
}
	