package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.Predicate;

public class Client5 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing Predicate 
		// Predicate<T>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | Predicate<T>          | 1 (T)       | boolean     | test                   |
		// +----------------------------------------------------------------------------+
		
		Predicate<String> predicate1 = String::isEmpty;
		Predicate<String> predicate2 = x -> x.isEmpty();
		
		Predicate<String> predicate3 = x -> x.isEmpty();
		predicate3 = predicate3.negate();
		predicate3 = predicate3.and(x -> x.contains("ab"));
		predicate3 = predicate3.or(x -> x.contains("ej"));
		
		System.out.println(predicate1.test(""));
		System.out.println(predicate2.test(""));
		System.out.println(predicate3.test("ab"));
		System.out.println(predicate3.test("ej"));
		System.out.println(predicate3.test("tt"));
	}

}
