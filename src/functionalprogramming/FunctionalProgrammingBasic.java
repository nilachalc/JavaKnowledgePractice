package functionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FunctionalProgrammingBasic {

	public static void main(String[] args) {
		List<Integer> l1 = List.of (17, 6,4,8,9,5,6, 13);
		//l1.stream().forEach(System.out.printin);
		//l1.stream().filter(FP01Functional :: isEven).forEach(System.out :: println);
		System.out.println(l1.stream().filter(val -> (val % 2 != 0)).reduce(0, (val1, val2) -> (val1 + val2)));
		BinaryOperator< Integer> bf = new BinaryOperator< Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		};
		System.out.println(l1.stream().filter(val -> (val % 2 != 0)).reduce(0, bf));
		List<String> topics = List. of("AWS", "SpringBoot", "MicroService", "Docker", "Jenkins", "SpringJDBC", "SpringDataJPA", "SpringBatch");

		topics.stream().filter(str -> str.contains("Spring")).forEach(System.out :: println);
		topics.stream().filter(str -> (str.length() < 10)).map(val -> val + "a"). forEach(System.out :: println);
		topics.stream().sorted(Comparator.comparing(str -> str. length())).forEach(str -> System.out.println(str));
		topics.stream().sorted(Comparator.comparing(String:: length).reversed( )).forEach(str -> System.out.println(str));// This is equivalent to the commented code below.

		/*OptionalInt maxLength = strings. stream) .mapToInt(stn -> str.length() ).max();
		Function<String, Integer> keyExtractor = str1 -› { return (maxLength.getAsInt() - str1. length());};
		strings.stream().sorted(Comparator.comparing(keyExtractor)).forEach(str-> System.out.printIn(st));*/

		System.out.println(topics.stream().collect(Collectors.joining(",")));
		System.out.println(topics.stream().map(t -> t.split("")).flatMap(Arrays :: stream).distinct().collect(Collectors.toList())); //forEach(str -› System.out.println(str);
		List<String> newTopics = List.of("AWS","APIGEE", "PCF","Angular","Node","React", "REST", "Docker");
		
		//Now we need to map one new topic to the existing topics based on same length.
		System.out.println(topics.stream().flatMap(t1 -> newTopics.stream()
										  .filter(t2 -> t2.length() == t1.length()) //applying filter before tuple as the filter logic is on String element property
										  .map(t2 -> List.of(t1, t2))) // Creating the tuple list here
										  .filter(li -> !li.get(0).equals(li.get(1)))  // applying filter after tuple as the filter logic is on List of String element
										  .collect(Collectors.toList()));
		List<String> strings = new ArrayList<String>(newTopics);
		strings.replaceAll(str -> str.toLowerCase());
		strings.removeIf(s -> s.length() < 5);
		strings.forEach(s -> System.out.println(s));
	}

}
