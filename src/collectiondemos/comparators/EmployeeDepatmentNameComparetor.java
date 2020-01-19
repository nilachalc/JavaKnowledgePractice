package collectiondemos.comparators;

import java.util.Comparator;

import testbeans.Employee;

public class EmployeeDepatmentNameComparetor implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getDepartment().getDepartmentName().compareTo(emp2.getDepartment().getDepartmentName());
	}
}
