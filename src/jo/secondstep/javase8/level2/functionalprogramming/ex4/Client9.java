package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.UnaryOperator;

public class Client9 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing UnaryOperator 
		// UnaryOperator<T>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | UnaryOperator<T>      | 1 (T)       | T           | apply                    |
		// +----------------------------------------------------------------------------+
		
		UnaryOperator<String> unaryOperator1 = String::toUpperCase;
		UnaryOperator<String> unaryOperator2 = x -> x.toUpperCase();
		
		System.out.println(unaryOperator1.apply("book"));
		System.out.println(unaryOperator2.apply("book"));
	}

}
