package functionalprogramming;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PlyingWithStreams {
	public static void main (String[] args) {
		IntStream.range(1, 11).forEach(i -> System.out.print(i + "  "));
		System.out.println();
		IntStream.rangeClosed(1, 11).forEach(i -> System.out.print(i + "  "));
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println();
		System.out.println(IntStream.iterate(1,	i -> {i++ ;return i * i;}).limit(4).peek(i -> System.out.println(i)).average());
		System.out.println (LongStream.rangeClosed(1, 30)
				.mapToObj(BigInteger :: valueOf).limit(10)
				.peek(i -> System.out.println(i))
				.reduce(BigInteger.ONE, (x, y) -> x.multiply(y)));
		LongStream.iterate(2, x -> x * x)
				.mapToObj(BigInteger :: valueOf)
				.limit(10).peek(bi -> System.out.println(bi.doubleValue()));
	}
}