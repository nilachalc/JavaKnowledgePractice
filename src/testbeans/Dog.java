package testbeans;

public class Dog implements  Comparable<Dog> {
	int age;

	public Dog(int a) {
		age = a;
	}

	@Override
	public String toString() {
		return age + "";
	}

	@Override
	public int compareTo(Dog dog) {
		return age - dog.age; 
	}
}
