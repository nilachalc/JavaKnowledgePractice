package generalpurpose;

public class ValuePassArrays {
	
	private void changeValue(int[] age) {
		for(int i = 0; i< age.length; i++) {
			age[i] += 10;
		}
		System.out.println("from int");
	}
	
	private void changeValue(Integer[] age) {
		for(int i = 0; i< age.length; i++) {
			age[i] += 10;
		}
		System.out.println("from integer");
	}
	
	public static void main(String[] args) {
		int[] empAges =  {5, 6, 7, 8, 9};
		Integer[] empIntegerAges = {5, 6, 7, 8, 9};
		ValuePassArrays passArrays = new ValuePassArrays();
		
		passArrays.changeValue(empAges);
		for(int i = 0; i< empAges.length; i++) {
			System.out.println(empAges[i]);
		}
		
		passArrays.changeValue(empIntegerAges);
		for(int i = 0; i< empIntegerAges.length; i++) {
			System.out.println(empIntegerAges[i]);
		}
	}
}
