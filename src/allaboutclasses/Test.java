package allaboutclasses;

public class Test {

	public static void main(String[] args) {
		Box b1 = new Box();
//		Box b2 = new Box();
/*		b1.height = 2;
		b1.width = 4;
		b1.length = 3;*/
		b1.setVal(2,4,3);
//		b2 = b1;
//		b1.volume(2,4,3);
		System.out.println("Volume of box is: " + b1.volume());
	}
}
