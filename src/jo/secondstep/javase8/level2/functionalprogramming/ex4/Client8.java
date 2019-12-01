package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.BiFunction;

public class Client8 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing BiFunction 
		// BiFunction<T, U, R>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | BiFunction<T, U, R>   | 2 (T, U)    | R           | apply                  |
		// +----------------------------------------------------------------------------+
		
		BiFunction<String, Integer, String> biFunction1 = String::substring;
		BiFunction<String, Integer, String> biFunction2 = (string, beginIndex) -> string.substring(beginIndex);
		
		System.out.println(biFunction1.apply("Second", 3));
		System.out.println(biFunction2.apply("Second", 3));
	}

}
