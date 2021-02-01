
public class ArrayProcessingTester {
	
	public static void main(String[] args) {
		
		int[] array = {100, -5, 75, 30, 50};
		
		ArrayProcessingSolution ap = new ArrayProcessingSolution();
		
		//Test max
		int max = ap.findMax(array);
		System.out.println("Max Expected: 100");
		System.out.println("Max Actual: "+max);
		System.out.println();
		
		//Test min
		int min = ap.findMin(array);
		System.out.println("Min Expected: -5");
		System.out.println("Min Actual: "+min);
		System.out.println();
		
		//Test average
		int average = ap.findAverage(array);
		System.out.println("Avg Expected: 50");
		System.out.println("Avg Actual: "+average);
		System.out.println();
		
		//Test search
		boolean found = ap.search(array, 22);
		System.out.println("Search Expected: false");
		System.out.println("Search Actual: "+found);
		System.out.println();
		
		//Test print comma delimited
		System.out.println("Expected: 100,-5,75,30,50");
		System.out.print("Actual:   ");
		ap.printCommaDelimitedArray(array);	
		
	}

}
