package functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentFunctionalProgramming {
	public static void main(String[] args) {
		List<Department> departments = List.of(
				new Department ("D01", "ECE", 36, 95, true, "Great"),
				new Department ("D02", "CSE", 24, 98, true, "Great"),
				new Department ("D03", "ICE", 48, 96, true, "Good"),
				new Department ("D04", "IT", 60, 90, true, "Fine"),
				new Department ("D05", "CVL", 36, 102, false, ""),
				new Department ("D06", "MECH", 48, 89, true, "Great"),
				new Department ("D07", "AUTO", 60, 105, true, "nice"),
				new Department ("D08", "ELEC", 36, 85, false, ""));
		// Department List sorted by number of students.
		Department.comp (departments, Comparator.comparing(Department:: getNumberOfStudents)).forEach(System.out :: println);
		System.out.println();
		// Department List reversely sorted by duration then compared by number of students. 
		Department.comp(departments, Comparator.comparing(Department :: getDurationInMonths).reversed()
				  .thenComparing(Department :: getNumberOfStudents))
				  .forEach(dep -> System.out.println(dep.toString()));
		System.out.println();
		// Department List with top three departments with highest student count.
		Department.comp(departments, Comparator.comparing(Department:: getNumberOfStudents).reversed()).stream()
				  .limit(3).forEachOrdered(System.out :: println);
		Department.comp(departments, Comparator.comparing (Department:: getNumberOfStudents)).stream()
				  .skip(departments.size() - 3).forEachOrdered(System.out :: println);
		System.out.println();
		System.out.println();
		// List the departments names until CVL from the original list
		departments.stream().takeWhile(dep -> !dep.getName().equals("CVL")).forEach(dep -> System.out.println(dep.getName()));
		System.out.println();
		// List the departments ids after IT from the original list
		departments.stream().dropWhile(dep -> !dep.getName().equals("IT")).forEach(dep -> System.out.println(dep.getId())) ;
		System.out.println();
		// filter can be used for a single level filtration where as comparator is for multi level comparison with sorted function.
		departments.stream().filter(dep -> dep.getName().equals("IT")).forEach(dep -> System.out.println(dep.toString()));
		System.out.println(departments.stream().anyMatch(dep -> dep.getName().startsWith("E")));
		System.out.println(departments.stream().allMatch(dep-> dep.getId().startsWith("D")));
		System.out.println(departments.stream().allMatch(dep -> dep.getName().startsWith("D")));
		System.out.println(departments.stream().noneMatch(dep-> dep.getName().startsWith("D")));
		System.out.println(departments.stream().noneMatch(dep -> dep.getName().startsWith("E")));
		
		// sum, average, count, max, min, findfirst
		System.out.println(departments.stream().filter(dep -> dep.getReview().contains ("G"))
											  .max(Comparator.comparing(dep -> dep.getNumberOfStudents())));
		System.out.println(departments.stream().filter(dep -> dep.getDurationInMonths() == 36)
									  .map(dep -> dep.getNumberOfStudents()).count());
		System.out.println(departments.stream().filter(dep -> dep.getDurationInMonths() == 36)
												.mapToInt(dep -> dep.getNumberOfStudents().intValue()).sum());
		System.out.println(departments.stream().filter(dep -> dep.getDurationInMonths() == 36).mapToInt((dep -> dep.getNumberOfStudents().intValue())).average());
		System.out.println(departments.stream().filter(dep -> dep.getDurationInMonths () == 48).findFirst().get().getId());
		System.out.println(departments.stream().collect(Collectors.groupingBy(dep -> dep.isRviewAvailable(), Collectors.counting())));
		System.out.println(departments.stream().collect(Collectors.groupingBy(d -> d.isRviewAvailable(), Collectors.filtering(d -> d.getDurationInMonths() < 50, Collectors.toList()))));
		
		System.out.println(departments.stream().collect(Collectors.groupingBy(d -> d.isRviewAvailable()
							, Collectors.filtering(d -> d.getDurationInMonths() < 50
							, Collectors.mapping(d -> d.getName(), Collectors.toList())))));
							
		departments.stream().collect(Collectors.groupingBy(d -> d.isRviewAvailable()
							, Collectors.filtering(d -> d.getDurationInMonths() < 50
							, Collectors.mapping(d -> d.getName(), Collectors.toList()))))
								.forEach((b, los) -> {
									System.out.println();
									System.out.println(b.booleanValue() + " :");
									los.stream().forEach(str -> System.out.println(str + ", "));
								});
		
	}
}
