package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.function.Consumer;

public class Client3 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing Consumer 
		// Consumer<T>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | Consumer<T>           | 1 (T)       | void        | accept                 |
		// +----------------------------------------------------------------------------+
		
		
		Consumer<String> print1 = System.out::println;
		Consumer<String> print2 = x -> System.out.println(x);
		
		print1.accept("Amer");
		print2.accept("Java");
	}

}
