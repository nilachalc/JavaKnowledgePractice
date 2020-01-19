package generalpurpose;

public class Operators {

	public static void main(String[] args) {
		int x = 0;
		int b = x++ + ++x + x++ + x++;
		System.out.println(b);
		System.out.println(x);
	}
}
