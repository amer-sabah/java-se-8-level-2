package jo.secondstep.javase8.level2.streamapi.ex3;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Primitives
		// Creating Primitive Streams
		// * IntStream: Used for the primitive types int, short, byte, and char
		// * LongStream: Used for the primitive type long
		// * DoubleStream: Used for the primitive types double and float
		//
		//
		// Mapping methods between types of streams
		// +--------------------------------------------------------------------+
		// | Source Stream | To Create  | To Create    | To Create | To Create  |
		// | Class         | Stream     | DoubleStream | IntStream | LongStream |
		// +--------------------------------------------------------------------+
		// | Stream        | map        | mapToDouble  | mapToInt  | mapToLong  |       
		// +--------------------------------------------------------------------+
		// | DoubleStream  | mapToObj   | map          | mapToInt  | mapToLong  |       
		// +--------------------------------------------------------------------+
		// | IntStream     | mapToObj   | mapToDouble  | map       | mapToLong  |       
		// +--------------------------------------------------------------------+
		// | LongStream    | mapToObj   | mapToDouble  | mapToInt  | map        |       
		// +--------------------------------------------------------------------+
		//
		// 
		// Function parameters when mapping between types of streams                     
		// +----------------------------------------------------------------------------------------------------+
		// | Source Stream | To Create      | To Create            | To Create           | To Create            |
		// | Class         | Stream         | DoubleStream         | IntStream           | LongStream           |
		// +----------------------------------------------------------------------------------------------------+
		// | Stream        | Function       | ToDoubleFunction     | ToIntFunction       | ToLongFunction       |       
		// +----------------------------------------------------------------------------------------------------+
		// | DoubleStream  | DoubleFunction | DoubleUnaryOperator  | DoubleToIntFunction | DoubleToLongFunction |       
		// +----------------------------------------------------------------------------------------------------+
		// | IntStream     | IntFunction    | IntToDoubleFunction  | IntUnaryOperator    | IntToLongFunction    |       
		// +----------------------------------------------------------------------------------------------------+
		// | LongStream    | LongFunction   | LongToDoubleFunction | LongToIntFunction   | LongUnaryOperator    |       
		// +----------------------------------------------------------------------------------------------------+
		                                                                                                        
		
		System.out.println("----------------------- (1) ----------------------");
		
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) -> s + n));
		
		System.out.println("----------------------- (2) ----------------------");
		
		Stream<Integer> stream2 = Stream.of(1, 2, 3);
		System.out.println(stream2.mapToInt(x -> x).sum());
		
		System.out.println("----------------------- (3) ----------------------");
		
		IntStream intStream = IntStream.of(1, 2, 3);
		OptionalDouble avg = intStream.average();
		System.out.println(avg.getAsDouble());
		
		System.out.println("----------------------- (4) ----------------------");
		
		DoubleStream empty = DoubleStream. empty ();
		System.out.println(empty.count());
		
		System.out.println("----------------------- (5) ----------------------");
		
		DoubleStream oneValue = DoubleStream. of (3.14);
		DoubleStream varargs = DoubleStream. of (1.0, 1.1, 1.2);
		oneValue.forEach(System.out::println);
		System.out.println("---");
		varargs.forEach(System.out::println);
		
		System.out.println("----------------------- (6) ----------------------");
		
		DoubleStream random = DoubleStream. generate (Math::random);
		DoubleStream fractions = DoubleStream. iterate (.5, d -> d / 2);
		random.limit(3).forEach(System.out::println);
		System.out.println();
		fractions.limit(3).forEach(System.out::println);
		
		System.out.println("----------------------- (7) ----------------------");
		
		IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
		count.forEach(System.out::println);
		
		System.out.println("----------------------- (8) ----------------------");
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		
		System.out.println("----------------------- (9) ----------------------");
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println);
		
		System.out.println("----------------------- (10) ----------------------");
		
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream2 = objStream.mapToInt(s -> s.length());
		intStream2.forEach(System.out::println);
		
		System.out.println("----------------------- (END) ----------------------");
		
	}
}
