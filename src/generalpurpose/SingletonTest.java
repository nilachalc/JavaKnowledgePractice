package generalpurpose;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstance(); 
		singletonClass.testMethod();
	}
}

class SingletonClass {
	private static SingletonClass singletonClass;
	
	private SingletonClass() {}
	
	public static synchronized SingletonClass getInstance() {
		if (singletonClass != null) {
			return singletonClass;
		} else {
			return new SingletonClass();
		}
	}
	
	public void testMethod() {
		System.out.println("From Singleton");
	} 
}
