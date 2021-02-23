
public class MyArrListTester {
	
	public static void main(String[] args) {
	
		MyArrayList<Integer> List = new MyArrayList<>();
		
		List.add(1);
        List.add(2);
        
        List.clear();
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(1,5);
        List.add(2,2);
        List.set(2,5);
		
		for (int i = 0; i < List.size(); i++) {
			System.out.print(List.get(i) + " ");
		}
	
	}
	
}
