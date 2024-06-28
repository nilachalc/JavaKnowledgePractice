package functionalprogramming;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PlyingWithStreams {
	public static void main (String[] args) {
		System.out.println(IntStream.range(1, 11));
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 10));
		System.out.println();
		System.out.println(IntStream.rangeClosed(1, 10). sum());
		System.out.println(IntStream.iterate(2,	i -> {i = i + 2;return i * i;}).limit(4).peek(i -> System.out.println(i)).average());
		System.out.println (LongStream.rangeClosed(1, 30)
				.mapToObj(BigInteger :: valueOf).limit(10)
				.peek(i -> System.out.println(i))
				.reduce(BigInteger.ONE, (x, y) -> x.multiply(y)));
		System.out.println(LongStream.iterate(2, x -> x * x)
				.mapToObj(BigInteger :: valueOf)
				.limit(10).peek(bi -> System.out.println(bi.doubleValue())));
	}
}