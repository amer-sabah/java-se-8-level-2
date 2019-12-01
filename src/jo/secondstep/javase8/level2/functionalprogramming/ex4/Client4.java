package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Client4 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing BiConsumer 
		// BiConsumer<T, U>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | BiConsumer<T, U>      | 2 (T, U)    | void        | accept                 |
		// +----------------------------------------------------------------------------+
		
		Map<String, Integer> store = new HashMap<>();
		
		BiConsumer<String, Integer> biConsumer1 = store::put;
		BiConsumer<String, Integer> biConsumer2 = (k, v) -> store.put(k, v);
		
		biConsumer1.accept("mobile", 7);
		biConsumer2.accept("book", 1);
		
		System.out.println(store);
	}

}
