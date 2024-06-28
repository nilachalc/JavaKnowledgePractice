package functionalprogramming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BehaviourParameterizationAndHigherOrderFunction {
	private static List<Integer> integers = List.of(4, 17, 6, 8, 9, 5, 6, 13, 52, 73); 
	
	private static void calcAndPrint(Function<Integer, Integer> fn) {
		integers.stream().map(fn).forEach(x -> System.out.println(x));
	}
	
	private static void printQube() {
		System.out.println("Qubes: ");
		calcAndPrint(x -> x * x * x);
	}
	
	private static void printSqure() {
		System.out.println("Squre: ");
		calcAndPrint(x -> x * x);
	}
	
	private static BinaryOperator<Integer> operationDecider(String val) {
		switch (val) {
			case "SUM": {
				return (x, y) -> x + y;
			}
			case "SUBTRACT": {
				return (x, y) -> x - y;
			}
			case "MULTIPLY": {
				return (x, y) -> x * y;
			}
			case "DEVIDE": {
				return (x, y) -> x / y;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + val);
		}
	}
	
	private static void calc(BinaryOperator<Integer> bf, Integer i, Integer j) {
		System.out.println(bf.apply(i, j));
	}
	
	public static void main(String[] args) {
		printSqure();
		printQube();
		
		calc(operationDecider("MULTIPLY"), 5, 6);
	}
}
