//@author Carter Schmidt
import java.util.Scanner;

/*
 * If the user enters:
 * All dogs go to heaven
 * U
 * R
 * Z
 * C - O A
 * C - A t
 * Z
 * X
 *  the output from the program will be "All DAGS GA TA HEAVEN"
 *  
 * If the user enters:
 * Fly Eagles Fly
 * L
 * R
 * C - yl it
 * Z
 * R
 * U
 * X
 *  the output from the program will be "FLY EAGLES FLY"
 *  
 *  
 */


public class EditStringUsingStack {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String editString;
		ArrayBoundedStack<String> stack = new ArrayBoundedStack<>();
		
		System.out.println("Welcome to Edit String");
		System.out.println("You can do the following operations on the String:");
		System.out.println("U - make all letters uppercase");
		System.out.println("L - make all letters lowercase");
		System.out.println("R - reverse the String");
		System.out.println("C - change all occurences of substring 1 with substring 2");
		System.out.println("Example: C ch1 ch2 will change any occurence of ch1 within a String with ch2");
		System.out.println("Z - undo the most recent change");
		
		System.out.println("Please enter a String");
		editString = in.nextLine();
		System.out.println("Enter an operation");
		String operation = in.nextLine();
		stack.push(editString);
		
		while(!operation.equalsIgnoreCase("X")) {
			if(operation.equalsIgnoreCase("U")) {
				
				//uses toUpperCase method and pushes new String to stack
				
				editString = editString.toUpperCase();
				stack.push(editString);
				
			}
			else if(operation.equalsIgnoreCase("L")) {
				
				//uses toLowerCase method and pushes new String to stack
				
				editString = editString.toLowerCase();
				stack.push(editString);
				
							
			}
			else if(operation.equalsIgnoreCase("R")) {
				
				/*Loops through each character and copies them to a new String
				 * in backwards order to create reversed String.
				 * New String is pushed to stack
				 */
				
				String reverseString = "";
				
				for (int i = 0; i < editString.length(); i++) {
					
					reverseString += editString.charAt(editString.length() - i - 1);
					
				}
				editString = reverseString;
				stack.push(editString);
				
						
			}
			else if(operation.equalsIgnoreCase("C")) {
				System.out.println("Enter substring to repalce");
				String replace = in.nextLine();
				System.out.println("Enter substring to replace with");
				String replaceWith = in.nextLine();
				
				/* Loops through the String and checks for the first character of the replace String.
				 * Then we check if the String contains the whole replace String after the occurrence of the
				 * first character in the original String.
				 * If so, replace the instance of replace with replaceWith, if not then keep looking for 
				 * the first character of replace to check for other occurrences using the outer loop.
				 * Pushes new String at the end to stack.
				 */
				
				for (int i = 0; i < editString.length(); i++) {
					if (editString.charAt(i) == replace.charAt(0)) {
						editString = editString.substring(0, i) + replaceWith + editString.substring(i + replaceWith.length());
					}
					else if (editString.charAt(i) == replace.charAt(0) && replace.length() > 1) {
						
						for (int j = 1; j < replace.length(); j++) {
							if (editString.charAt(i + j) != replace.charAt(j)) {
								j = replace.length();
							}
							
							else if (j == replace.length() - 1) {
								editString = editString.substring(0, i) + replaceWith + editString.substring(i + replaceWith.length());
								i += replaceWith.length();
							}						
						}
						
					}
					
				}
				stack.push(editString);
						
			} else if(operation.equalsIgnoreCase("Z")) {
				
				/*Uses the stack to undo changes by removing the most recently added version of editString
				 * with the pop() method and changing editString to the previous top of the stack in case
				 * further operations are conducted.
				 */
				
				
				stack.pop();
				editString = stack.top();
				
				
					
			}	
			System.out.println("Enter next operation or X to quit");
			operation=in.nextLine();
		}
		System.out.println("Thanks for playing. Your final string is");
		if(!stack.isEmpty()) {
			System.out.println(stack.top());
		}
		
		in.close();
	}
		
}
	
	