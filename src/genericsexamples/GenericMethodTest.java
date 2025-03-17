package genericsexamples;

//Demonstrate a simple generic method.
class GenericMethodTest {
	// Determine if an object is in an array.
	static <T, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++) 
			if (x.equals(y[i]))
				return true;
		return false;
	}

	public static void main(String args []) {
		// Use isin() on Integers.
		Integer nums [] = { 1, 2, 3, 4, 5 };
		GenericMethodTest genericMethodTest [] = {new GenericMethodTest(), new GenericMethodTest(), new GenericMethodTest()
													, new GenericMethodTest(), new GenericMethodTest()};
		if(isIn (2, nums)) 
			System.out.println("2 is in nums");
		else
			System.out.println("2 is in not in nums");
		if (isIn (7, nums))
			System.out.println("7 is not in nums");
		else
			System.out.println("7 is in not in nums");
		System.out.println();
		// Use isIn() on Strings.
		String strs[] = { "one", "two", "three","four", "five"};
		if(isIn ("two", strs))
			System.out.println("two is in str");
		else
			System.out.println("two is in not in str");
		if (isIn("seven", strs) )
			System.out. println ("seven is not in strs");
		else
			System.out.println("seven is in not in str");
	}
}
