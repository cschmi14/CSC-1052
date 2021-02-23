 /**
 * GreaterThanMaxException represents an exception when SafeNumber is greater than Max. 
 * @author Your Name
 *
 */

public class GreaterThanMaxException extends Exception {

	/**
	 * Constructing by invoking Exception constructor 
	 */
	public GreaterThanMaxException() {
		super();
	}

	/**
	 * Constructing by invoking Exception constructor 
	 * @param message
	 */
	public GreaterThanMaxException(String message) {
		super(message);
	}

}
