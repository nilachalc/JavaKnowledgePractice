package generalpurpose;
public class OverloadDemo {

	void show(){System.out.println("inside show()");}
	void show(int x){System.out.println("inside show(int)");}
	void show(int x, double y){System.out.println("inside show(int, double)");}
	void show(double x){System.out.println("inside show(double)");}
	void show(char x){System.out.println("inside show(char)");}
	public static void main(String args[]) {
		OverloadDemo demo = new OverloadDemo();
		//demo.show();
		demo.show(1);
		//demo.show(1, 1.78);
		demo.show(1.56);
		//demo.show('C');
	}
}
