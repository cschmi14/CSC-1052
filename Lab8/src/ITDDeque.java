
/**
 * Interactive Test Driver for the Deque class
 * This is a modified version of the ITDArrayBoundedQueue from the textbook.
 */
import java.util.*;

public class ITDDeque
{
  public static void main(String[] args)
  { 
    DequeInterface<String> test = new LinkedDeque<String>();
    Scanner scan = new Scanner(System.in);

    String skip;       // skip end of line after reading an integer
    boolean keepGoing; // flag for "choose operation" loop
    int operation;     // indicates user's choice of operation

    String enqueueString = "", dequeueString = "";  // used by operations
    
    // Handle test cases
    keepGoing = true;  
    while (keepGoing)
    {
      System.out.println("\nChoose an operation:");
      System.out.println("1: enqueueFront(element)");
      System.out.println("2: enqueueRear(element)");
      System.out.println("3: String dequeueFront()");
      System.out.println("4: String dequeueRear()");
      System.out.println("5: boolean isFull()");
      System.out.println("6: boolean isEmpty()");
      System.out.println("7: int size()");      
      System.out.println("8: stop Testing");
      if (scan.hasNextInt())
        operation = scan.nextInt();
      else
      {
        System.out.println("Error: you must enter an integer.");
        System.out.println("Terminating test.");
        return;
      } 
      skip = scan.nextLine();

      switch (operation)
      {
        case 1:  // enqueue
        System.out.println("Enter string to enqueue front:");
        enqueueString = scan.nextLine();
        System.out.println("enqueue(\"" + enqueueString + "\")");
        try
        { 
          test.enqueueFront(enqueueString);
        }
        catch (QueueOverflowException QOFException)
        {
          System.out.println("Overflow Exception: " + QOFException.getMessage());
        }        
        break;
        
        case 2:  
        	System.out.println("Enter string to enqueue rear:");
            enqueueString = scan.nextLine();
            System.out.println("enqueue(\"" + enqueueString + "\")");
            try
            { 
              test.enqueueRear(enqueueString);
            }
            catch (QueueOverflowException QOFException)
            {
              System.out.println("Overflow Exception: " + QOFException.getMessage());
            }     	
        	
        break;
        
        case 3:  
        	// dequeue
            System.out.println("dequeueFront()");
            try
            { 
              dequeueString = test.dequeueFront();
            }
            catch (QueueUnderflowException QUFException)
            {
              System.out.println("Underflow Exception: " + QUFException.getMessage());
              break;
            }        
            System.out.println("Result: " + dequeueString + " was returned.");// isFull
      
        break;
        
        case 4:  
        	System.out.println("dequeueRear()");
            try
            { 
              dequeueString = test.dequeueRear();
            }
            catch (QueueUnderflowException QUFException)
            {
              System.out.println("Underflow Exception: " + QUFException.getMessage());
              break;
            }        
            System.out.println("Result: " + dequeueString + " was returned.");// isFull
        break;
            
        case 5:
            System.out.println("isFull()");
        System.out.println("Result: " + test.isFull());
        break;
        
        case 6:
        	// isEmpty
        System.out.println("isEmpty()");
        System.out.println("Result: " + test.isEmpty());
        break;
        
        case 7:  // size
        System.out.println("size()");
        System.out.println("Result: " + test.size());
        break;
        
        case 8:  // stop testing
        keepGoing = false;
        break;
        
        default:
        System.out.println("Error in operation choice. Terminating test.");
        return;
      }
    }

  System.out.println("End of Interactive Test Driver");
  }
}