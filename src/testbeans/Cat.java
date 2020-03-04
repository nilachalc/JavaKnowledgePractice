package testbeans;

public class Cat implements Comparable<Cat>{

	Integer size;
	String color;
	
	public Cat(Integer size, String color) {
		this.color = color;
		this.size = size;
	}
	
	public boolean equals(Object o) {
		return ((Cat) o).color == this.color;
	}
	
	public int hashCode() {
		return color.length();
	}
	
	public String toString() {
		return ("Cat Details :: color : " + color + " size : " + size);
	}

	@Override
	public int compareTo(Cat c) {
		return this.size - c.size;
	}
}
