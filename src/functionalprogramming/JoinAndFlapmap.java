package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinAndFlapmap {
	
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		System.out.println(courses.stream().collect(Collectors.joining(".")));
		
		System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays :: stream).distinct().collect(Collectors.toList()));
	}
}

