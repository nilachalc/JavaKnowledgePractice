package generalpurpose;
public class TypeConv {
	public static void main(String[] args) {
		int b = 25;
		b = (byte)(b*2);
		System.out.println(b);
		b*=20;  //Shorthand operators skips the automatic type conversion. 
		System.out.println(b);
	}
}
