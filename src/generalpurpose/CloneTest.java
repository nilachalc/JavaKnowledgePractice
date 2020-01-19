package generalpurpose;
public class CloneTest {
	
	public static void main(String args[]) 
	{
		Test test = new Test();
		test.i = 5;
		test.j = 6;
		Test test1 = null;
		try {
			test1 = (Test)test.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		test1.j = 9;
		System.out.println(test);
		System.out.println(test1);
	}

}

class Test implements Cloneable
{
	int i;
	int j;
	
	@Override
	public String toString() {
		return "i = " + i + "j = " + j;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}