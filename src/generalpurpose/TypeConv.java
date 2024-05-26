package generalpurpose;
public class TypeConv {
	public static void main(String[] args) {
		int b = 25;
		b = (byte)(b*2);
		System.out.println(b);
		b*=20;  //Shorthand operators skips the automatic type conversion. 
		System.out.println(b);
		
		int a = -8;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a << 3);
		System.out.println(Integer.toBinaryString(a << 3));
		System.out.println(a >> 2);
		System.out.println(Integer.toBinaryString(a >> 2));
		System.out.println(a >>> 2);// As the unsigned right shift operator is used so the Higher order bits are being considered as value and not sign
		System.out.println(Integer.toBinaryString(a >>> 2));
		int p = 8;
		System.out.println(p >>> 2);
		System.out.println(Integer.toBinaryString(p >>> 2));
	}
}
