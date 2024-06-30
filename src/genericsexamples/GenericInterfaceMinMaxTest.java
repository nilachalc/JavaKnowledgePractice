package genericsexamples;

interface GenericInterfaceMinMax<T extends Comparable<T>> {
	T min();
	T max();
}


public class GenericInterfaceMinMaxTest<T extends Comparable<T>> implements GenericInterfaceMinMax<T> {
	
	T  []ob;
	
	GenericInterfaceMinMaxTest(T []val) {
		ob = val;
	}
	
	@Override
	public T min() {
		T v = ob[0];
		
		for (int i = 0; i < ob.length; i++) {
			if (ob[i].compareTo(v) < 0) {
				v = ob[i];
				
			}
			
		}
		 
		return v;
	}

	@Override
	public T max() {
		T v = ob[0];
		
		for (int i = 0; i < ob.length; i++) {
			if (ob[i].compareTo(v) > 0) {
				v = ob[i];
				
			}
		}
		 
		return v;
	}
	
	public static void main(String[] args) {
		Integer []integers = {3, 4,8, 2, 5, 10,20, 12};
		Character []strs = {'w', 's', 'd', 'g', 'p'};
		
		GenericInterfaceMinMaxTest<Integer> minMaxTest = new GenericInterfaceMinMaxTest<>(integers);
		GenericInterfaceMinMaxTest<Character> minMaxTest1 = new GenericInterfaceMinMaxTest<>(strs);
		
		System.out.println(minMaxTest.min());
		System.out.println(minMaxTest.max());
		
		System.out.println(minMaxTest1.min());
		System.out.println(minMaxTest1.max());
	}
}