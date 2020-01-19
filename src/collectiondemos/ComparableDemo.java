package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import testbeans.ComparableEmployee;

public class ComparableDemo {
	
	public static void main(String[] args) {
		List<ComparableEmployee> employees = new ArrayList<ComparableEmployee>();
		
		ComparableEmployee employee1 = new ComparableEmployee("Nilachal", 28);
		ComparableEmployee employee2 = new ComparableEmployee("Ram", 28);
		ComparableEmployee employee3 = new ComparableEmployee("Abhidip", 32);
		ComparableEmployee employee4 = new ComparableEmployee("Unmesha", 29);
		ComparableEmployee employee5 = new ComparableEmployee("Pinaki", 31);
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		System.out.println("::Before Sorting::");
		for(ComparableEmployee employee : employees) {
			System.out.println(employee.toString());
		}
		
		Collections.sort(employees);
		
		System.out.println("::After Sorting::");
		for(ComparableEmployee employee : employees) {
			System.out.println(employee.toString());
		}
	}
}
