package testbeans;
import java.io.Serializable;

public class Employee implements Serializable {
	
	private String name;
	private Integer age;
	private Department department = new Department();
	
	public Employee() {	}
	
	public Employee(String name, Integer age) {
		this.name = name;
		this.age = age; 
	}
	
	public Employee(String name, Integer age, Department department) {
		this.name = name;
		this.age = age;
		this.department = department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		super.toString();
		return ("Employee Name is --> " + name + " Employee Age is --> "  + age + "\n::Employee Department Details:: \n" + department.toString());
	}
}
