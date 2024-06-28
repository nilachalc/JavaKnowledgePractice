package functionalprogramming;

import java.util.List;
import java.util.stream.LongStream;

public class FunctionalProgrammingPerf {

	public static void main(String[] args) {
		List<String> topics = List.of("AWS", "SpringBoot", "MicroService", "Docker", "Jenkins","SpringJDBC", "SpringDataJPA", "SpringBatch");
		System.out.println(topics.stream().peek(System.out :: println)
		.filter(str -> str.length() > 11).map(str -> str.toUpperCase()).peek(System.out :: println).findFirst()); //it stops whenever it gets the first match.
		long time = System.currentTimeMillis();
		System.out.println(LongStream.rangeClosed(1, 78542159).parallel().sum());
		System.out.println("Time taken: " + (System.currentTimeMillis() - time));
	}
}
