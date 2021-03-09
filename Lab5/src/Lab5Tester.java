//@author Carter Schmidt
/*
 * After running this program, your output should look like this:
 * 
Original stack
I'm the top of the stack
fourth
third
second
first
There are 5 strings on this stack

State of stack after popping 2 elements
third
second
first

State of stack after swapStart
second
third
first

poptop shows this as top of stack before popping - second

Final state of stack
third
first
 */

public class Lab5Tester {
	
	public static void main(String[] args) {
		
		LinkedStack<String> stack = new LinkedStack<>();
		
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		stack.push("I'm the top of the stack");
		
		System.out.println("Original stack");
		System.out.println(stack.toString());
		System.out.println("There are "+stack.size()+" strings on this stack");
		System.out.println();
		
		stack.popSome(2);
		System.out.println("State of stack after popping 2 elements");
		System.out.println(stack.toString());
		System.out.println();
		
		stack.swapStart();
		System.out.println("State of stack after swapStart");
		System.out.println(stack.toString());
		
		System.out.println();
		System.out.println("poptop shows this as top of stack before popping - "+stack.poptop());
		System.out.println();
		System.out.println("Final state of stack");
		System.out.println(stack.toString());
		
	}
}
