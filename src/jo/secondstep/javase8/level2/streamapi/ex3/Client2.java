package jo.secondstep.javase8.level2.streamapi.ex3;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Primitives
		// Using Optional with Primitive Streams
		//
		//
		// Optional types for primitives
		// +-------------------------------------------------------------------------------+
		// |                            | OptionalDouble | OptionalInt    | OptionalLong   |
		// +-------------------------------------------------------------------------------+
		// | Getting as a primitive     | getAsDouble()  | getAsInt()     | getAsLong()    |       
		// +-------------------------------------------------------------------------------+
		// | orElseGet() parameter type | DoubleSupplier | IntSupplier    | LongSupplier   |       
		// +-------------------------------------------------------------------------------+
		// | Return type of max()       | OptionalDouble | OptionalInt    | OptionalLong   |       
		// +-------------------------------------------------------------------------------+
		// | Return type of sum()       | double         | int            | long           |       
		// +-------------------------------------------------------------------------------+
		// | Return type of avg()       | OptionalDouble | OptionalDouble | OptionalDouble |       
		// +-------------------------------------------------------------------------------+
		//

		                                                                                                        
		
		System.out.println("----------------------- (1) ----------------------");
		
		IntStream stream = IntStream.rangeClosed(1,10);
		OptionalDouble optional = stream.average();
		
		System.out.println("----------------------- (2) ----------------------");
		
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(() -> Double.NaN));
		
		System.out.println("----------------------- (3) ----------------------");
		
		LongStream longs = LongStream.of(5, 10);
		long sum = longs.sum();
		System.out.println(sum);
		
		System.out.println("----------------------- (4) ----------------------");
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		OptionalDouble min = doubles.min();
		System.out.println(min);
		
		System.out.println("----------------------- (END) ----------------------");
		
	}
}
