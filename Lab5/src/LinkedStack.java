//----------------------------------------------------------------------
// LinkedStack.java         by Dale/Joyce/Weems                Chapter 2
//
// Implements StackInterface using a linked list to hold the elements.
//-----------------------------------------------------------------------


public class LinkedStack<T> implements StackInterface<T>
{
  protected LLNode<T> top;   // reference to the top of this stack

  public LinkedStack()
  {
    top = null;
  }

  public void push(T element)
  // Places element at the top of this stack.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    newNode.setLink(top);
    top = newNode;
  }     

  public void pop()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise removes top element from this stack.
  {                  
    if (isEmpty())
      throw new StackUnderflowException("Pop attempted on an empty stack.");
    else
      top = top.getLink();
  }

  public T top()
  // Throws StackUnderflowException if this stack is empty,
  // otherwise returns top element of this stack.
  {                 
    if (isEmpty())
      throw new StackUnderflowException("Top attempted on an empty stack.");
    else
      return top.getInfo();
  }

  public boolean isEmpty()
  // Returns true if this stack is empty, otherwise returns false.
  {             
    return (top == null); 
  }

  public boolean isFull()
  // Returns false - a linked stack is never full
  {              
      return false;
  }
  
  public String toString() {
	  /*iterates through stack with currNode, and adds currNode's info
	   * to the String str that is later returned.
	   * In order to not add an extra line, check if last node is null before adding line between
	   * elements.
	   */
	  String str = "";
	  LLNode<T> currNode = new LLNode<T>(top.getInfo());
	  currNode.setLink(top.getLink());
	  while (currNode != null) {
		  str += currNode.getInfo();
		  currNode = currNode.getLink();
		  if (currNode != null ) {
			  str = str + "\n";
		  }
	  } 
	  return str;
  }
  
  public int size() {
	  /* iterates through the stack with currNode, and increases count until currNode is
	   * null, indicating the end of the stack. Return count since it is the size;
	   */
	  int count = 0;
	  LLNode<T> currNode = new LLNode<T>(top.getInfo());
	  currNode.setLink(top.getLink());
	  while (currNode != null) {
		  count++;
		  currNode = currNode.getLink();
	  }
	  return count;	  
  }
  
  public void popSome(int count) throws StackUnderflowException{
	  /* loop count number of times, and for each repetition execute the pop() method
	   * with top = top.getLink(); to remove the top element of stack.
	   */
	  while (count > 0) {
		  if (top == null) {
			  throw new StackUnderflowException();
		  }
		  top = top.getLink();
		  count--;
	  }
  }
  
  public boolean swapStart() { 
	  //copied from size() method to get stack size
	  int count = 0;
	  LLNode<T> currNode = new LLNode<T>(top.getInfo());
	  currNode.setLink(top.getLink());
	  while (currNode != null) {
		  count++;
		  currNode = currNode.getLink();
	  }
	  // if size less than 2 then swapStart() can't be executed
	  if (count < 2) {
		  return false;
	  }
	  /* create 2 nodes, topNode stores current top and secondNode stores current top.getLink().
	   * remove top element and set topNode's link to the new top.getLink(), then make the new top = topNode.
	   * use push() method code to add secondNode as a new node on top of topNode.
	   * The top 2 nodes have been swapped.
	   */
	  else {
		  LLNode<T> topNode = new LLNode<T>(top.getInfo());
		  LLNode<T> secondNode = new LLNode<T>(top.getLink().getInfo());
		  top = top.getLink();
		  topNode.setLink(top.getLink());
		  top = topNode;
		  secondNode.setLink(top);
		  top = secondNode;
		  return true;
	  }
  }
  
  public T poptop() throws StackUnderflowException{
	  //T Info for storing the top element's info
	  T info;
	  if (top == null) {
		  throw new StackUnderflowException();
	  }
	  //Info stores top nodes info with info = top.getInfo().
	  //remove top element with top = top.getLink(), and return the previous top, aka Info.
	  else {
		  info = top.getInfo();
		  top = top.getLink();
		  return info;
	  }
  }

}