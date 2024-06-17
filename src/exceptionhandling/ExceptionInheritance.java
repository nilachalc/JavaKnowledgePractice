package exceptionhandling;

class Parent {
	protected void methodOne(int arg) throws Throwable {
		System.out.println("From Parent " + arg);
	}
}

class Chield extends Parent {
	public void methodOne(int arg) throws Exception {
		System.out.println("From Parent " + arg);
	}
}

public class ExceptionInheritance {

	public static void main(String[] args) {
		
	}
}
