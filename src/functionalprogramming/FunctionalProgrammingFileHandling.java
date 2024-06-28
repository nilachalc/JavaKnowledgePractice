package functionalprogramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FunctionalProgrammingFileHandling {

	public static void main(String[] args) {
		Supplier<Stream<String>> fileContentSupplier = null;
		fileContentSupplier = () -> {
			Stream<String> innerSupplier = null;
			try {
				innerSupplier = Files.lines(Paths.get("TestFile.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return innerSupplier;
		};
		Stream<String> fileContent = fileContentSupplier.get();
		fileContent.forEach(s -> System.out.println(s));
		
		fileContent = fileContentSupplier.get();
		fileContent.map(fcS -> fcS.split(" "))
				   .flatMap(Arrays :: stream)
				   .distinct().forEach(fcsf -> System.out.println(fcsf)); 
	}
}
