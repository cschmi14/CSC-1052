package tester;
import custom.MyCustomIntegerArray;
public class MyCustomIntegerArrayTester {
	
	public static void main(String[] args) {
		int[] a = {1,5,6,7,7,8,5};
		MyCustomIntegerArray ca = new MyCustomIntegerArray(a);
		
		//Test toString
		System.out.println("toString expected: 1,5,6,7,7,8,5");
		System.out.println("toString acutal:   "+ca.toString());
		System.out.println();
		
		//Test incEachElement
		ca.incEachElement(5);
		System.out.println("incEachElement expected: 6,10,11,12,12,13,10");
		System.out.println("incEachElement acutal:   "+ca.toString());
		System.out.println();
		
		//Test incElementAt
		ca.incElementAt(2,5);
		System.out.println("incElementAt expected: 6,10,16,12,12,13,10");
		System.out.println("incElementAt acutal:   "+ca.toString());
		System.out.println();
		
		//Test reverseArrayOrder
		ca.reverseArrayOrder();
		System.out.println("reverseArrayOrder expected: 10,13,12,12,16,10,6");
		System.out.println("reverseArrayOrder acutal:   "+ca.toString());
		System.out.println();
		
		//Test removeDuplicates with duplicates
		ca.removeDuplicates();
		System.out.println("removeDuplicates expected: 10,13,12,16,6");
		System.out.println("removeDuplicates acutal:   "+ca.toString());
		System.out.println();
		
		//Test removeDuplicates without duplicates
		ca.removeDuplicates();
		System.out.println("removeDuplicates expected: 10,13,12,16,6");
		System.out.println("removeDuplicates acutal:   "+ca.toString());
		System.out.println();
		
		//Test setter
		int[] newArray = {1,2,3,4,5};
		ca.setMyIntArray(newArray);
		System.out.println("setter expected: 1,2,3,4,5");
		System.out.println("setter acutal:   "+ca.toString());
		System.out.println();
		
		//Test removeElement
		ca.removeElement(3);
		System.out.println("removeElement(3) expected: 1,2,3,5");
		System.out.println("removeElement(3) acutal:   "+ca.toString());
		System.out.println();
	}

}
