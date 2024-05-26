package generalpurpose;

public class IncrementOperatorDemo {
	public static void main(String[] args) {
		int i = 1;
		int j = i++ + ++i + ++i + ++i + i++ + i++ + i++ + ++i;
		System.out.println("i = " + i + " and j = " + j);
	}
}
