package collectiondemos.comparators;

import java.util.Comparator;

import testbeans.Employee;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getAge().compareTo(emp2.getAge());
	}

}
