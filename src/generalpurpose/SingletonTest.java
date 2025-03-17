package generalpurpose;

public class SingletonTest {
	public static void main(String[] args) {
		SingletonClass singletonClass = SingletonClass.getInstance(); 
		singletonClass.testMethod();
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		singletonClass1.testMethod();
	}
}

class SingletonClass {
	private static SingletonClass instance;
	
	private SingletonClass() {}
	
	public static synchronized SingletonClass getInstance() {
		if (instance != null) {
			System.out.println("Returning existing object.");
			return instance;
		} else {
			System.out.println("Creating new object.");
			instance = new SingletonClass();
			return instance;
		}
	}
	
	public void testMethod() {
		System.out.println("From Singleton");
	} 
}
