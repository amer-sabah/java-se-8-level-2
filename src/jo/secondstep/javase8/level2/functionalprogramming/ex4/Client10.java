package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.BinaryOperator;

public class Client10 {
	
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing BinaryOperator
		// BinaryOperator<T>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | BinaryOperator<T>     | 2 (T, T)    | T           | apply                  |
		// +----------------------------------------------------------------------------+
		
		BinaryOperator<String> binaryOperator1 = String::concat;
		BinaryOperator<String> binaryOperator2 = (string, toAdd) -> string.concat(toAdd);
		
		System.out.println(binaryOperator1.apply("First ", "Second"));
		System.out.println(binaryOperator2.apply("First ", "Second"));
	}

}
