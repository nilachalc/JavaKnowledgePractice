package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import collectiondemos.comparators.EmployeeAgeComparator;
import collectiondemos.comparators.EmployeeDepartmentIdComparator;
import collectiondemos.comparators.EmployeeDepatmentNameComparetor;
import collectiondemos.comparators.EmployeeNameComparator;
import testbeans.Department;
import testbeans.Employee;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		
		Department department1 = new Department(1, "PPS");
		Department department2 = new Department(2, "Insurance");
		Department department3 = new Department(3, "T&H");
		Department department4 = new Department(4, "BFS");
		
		Employee employee1 = new Employee("Nilachal", 28, department1);
		Employee employee2 = new Employee("Ram", 28, department2);
		Employee employee3 = new Employee("Abhidip", 32, department3);
		Employee employee4 = new Employee("Unmesha", 29, department4);
		Employee employee5 = new Employee("Pinaki", 31, department4);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		System.out.println("::Before Sorting::");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println();
		}
		System.out.println(" :: END OF DATA ::");
		System.out.println();
		
		Collections.sort(employees, new EmployeeNameComparator());
		
		System.out.println("::After Sorting By Name::");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println();
		}
		System.out.println(" :: END OF DATA ::");
		System.out.println();
		
		Collections.sort(employees, new EmployeeAgeComparator());
		
		System.out.println("::After Sorting By Age::");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println();
		}
		System.out.println(" :: END OF DATA ::");
		System.out.println();
		
		Collections.sort(employees, new EmployeeDepatmentNameComparetor());
		
		System.out.println("::After Sorting By Department Name::");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println();
		}
		System.out.println(" :: END OF DATA ::");
		System.out.println();
		
		Collections.sort(employees, new EmployeeDepartmentIdComparator());
		
		System.out.println("::After Sorting By Department Id::");
		for(Employee employee : employees) {
			System.out.println(employee.toString());
			System.out.println();
		}
		System.out.println(" :: END OF DATA ::");
		System.out.println();
	}
}
