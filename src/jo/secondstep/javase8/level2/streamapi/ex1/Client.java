package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Stream Sources

		Stream<String> emptyStream = Stream.empty();
		Stream<String> singleItemStream = Stream.of("One");
		Stream<String> manyItemsStream = Stream.of("One", "Two", "Three");

		System.out.printf("emptyStream -> %s\n", emptyStream.count());
		System.out.printf("singleItemStream -> %s\n", singleItemStream.count());
		System.out.printf("manyItemsStream -> %s\n", manyItemsStream.count());
		
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "k", "l");
		Stream<String> stringStream = list.stream();
		Stream<String> stringParallelStream = list.parallelStream();
		
		Stream<Double> randomDoubleStream = Stream.generate(Math::random);
		Stream<Integer> integerStream = Stream.iterate(0, n -> n + 1);
		
		stringStream.forEach(System.out::println);
		stringParallelStream.forEach(System.out::println);
		randomDoubleStream.forEach(System.out::println);
		integerStream.forEach(System.out::println);
	}
}
