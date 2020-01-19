package generalpurpose;

public class DynamicInit {

	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		int c = add(a, b);  //Dynamic Init
		System.out.println(c);
	}
	static int add(int a, int b) {
		return a + b;
	}
}
