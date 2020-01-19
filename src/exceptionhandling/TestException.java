package exceptionhandling;
public class TestException {

	public static void main(String[] args) {
		int a = 5;
		try {
			a = a/0;
			System.out.println("ja chai");
		} catch (Exception e) {
			System.out.println("ja chai catch");
		}
		finally {
			System.out.println("ja chai finally.");
		}
	}

}
