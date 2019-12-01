package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.Function;

public class Client7 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing Function
		// Function<T, R>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | Function<T, R>        | 1 (T)       | R           | apply                  |
		// +----------------------------------------------------------------------------+
		
		Function<String, Integer> function1 = String::length;
		Function<String, Integer> function2 = x -> x.length();
		
		System.out.println(function1.apply("book"));
		System.out.println(function2.apply("book"));
	}

}
