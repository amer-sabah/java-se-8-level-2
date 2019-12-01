package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.BiPredicate;

public class Client6 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing BiPredicate 
		// BiPredicate<T, U>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | BiPredicate<T, U>     | 2 (T, U)    | boolean     | test                   |
		// +----------------------------------------------------------------------------+
		
		BiPredicate<String, String> biPredicate1 = String::startsWith;
		BiPredicate<String, String> biPredicate2 = (string, prefix) -> string.startsWith(prefix);
		
		System.out.println(biPredicate1.test("second", "sec"));
		System.out.println(biPredicate2.test("second", "sec"));
		
	}

}
