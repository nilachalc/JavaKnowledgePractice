package collectiondemos.comparators;

import java.util.Comparator;

import testbeans.Employee;

public class EmployeeDepartmentIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getDepartment().getDepatmentId().compareTo(emp2.getDepartment().getDepatmentId());
	}
}
