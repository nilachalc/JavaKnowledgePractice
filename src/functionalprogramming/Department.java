package functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @AllArgsConstructor @ToString 
public class Department { 
	private String id;
	private String name;
	private int durationInMonths; 
	private Integer numberOfStudents;
	private boolean isRviewAvailable;
	private String review;
		
	public static List<Department> comp(List<Department> allDepartments, Comparator<Department> compareLogic) {
			return allDepartments.stream().sorted(compareLogic).collect(Collectors.toList());
	}
}
				