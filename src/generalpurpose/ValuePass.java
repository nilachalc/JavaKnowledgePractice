package generalpurpose;

import testbeans.Employee;

public class ValuePass {
	
	private void changeValue(String name, int age) {
		name += " Chakraborty";
		age += 5;
	}
	
	private void changeValue(Employee emp){
		emp.setName(emp.getName() + " Chakraborty");
		emp.setAge(emp.getAge() + 5);
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Nilachal");
		employee.setAge(28);
		
		ValuePass pass = new ValuePass();
		pass.changeValue(employee.getName(), employee.getAge());
		System.out.println("Name is = " + employee.getName() + " Age is = " + employee.getAge());
		
		pass.changeValue(employee);
		System.out.println("Name is = " + employee.getName() + " Age is = " + employee.getAge());
	}
}
