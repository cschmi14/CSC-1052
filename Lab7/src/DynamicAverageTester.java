
public class DynamicAverageTester {

	public static void main(String[] args) {
		
		
		/*
		 * Expected output:
		 * 	1.0
			5.5
			4.666666666666667
			6.0
		 */
		
		DynamicAverage da1 = new DynamicAverage(3);
		
		System.out.println(da1.next(1));
		System.out.println(da1.next(10));
		System.out.println(da1.next(3));
		System.out.println(da1.next(5));
		System.out.println();
		
		/*
		 * Expected output:
		 * 	1.0
			1.5
			2.0
			2.5
			3.5
			4.5
			5.5
			6.5
		 * 
		 */
		
		DynamicAverage da2 = new DynamicAverage(4);
		
		System.out.println(da2.next(1));
		System.out.println(da2.next(2));
		System.out.println(da2.next(3));
		System.out.println(da2.next(4));
		System.out.println(da2.next(5));
		System.out.println(da2.next(6));
		System.out.println(da2.next(7));
		System.out.println(da2.next(8));
		System.out.println();
		
		/*
		 * Expected output:
		 *  4.0
			7.0
			5.333333333333333
			5.0
			29.0
			27.0
			26.75
			25.0
		 */
		
		
		DynamicAverage da3 = new DynamicAverage(4);
		
		System.out.println(da3.next(4));
		System.out.println(da3.next(10));
		System.out.println(da3.next(2));
		System.out.println(da3.next(4));
		System.out.println(da3.next(100));
		System.out.println(da3.next(2));
		System.out.println(da3.next(1));
		System.out.println(da3.next(-3));

	}

}
