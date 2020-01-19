package testbeans;

public class ComparableEmployee implements Comparable<ComparableEmployee> {
	
	private String name;
	private Integer age;
	
	public ComparableEmployee(String name, Integer age) {
		this.name = name;
		this.age = age; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(ComparableEmployee employee) {
		return (this.age - employee.age);
	}

	@Override
	public String toString() {
		super.toString();
		return ("Employee Name is --> " + name + "\n" + "Employee Age is --> "  + age);
	}
}
