package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Client3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Method References
		
		//There are four formats for method references:
		//1. Static methods
		Consumer<List<Integer>> methodRef1 = Collections::sort; 
		Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);
		
		//2. Instance methods on a particular instance
		String str = "abc";
		Predicate<String> methodRef2 = str::startsWith;
		Predicate<String> lambda2 = s -> str.startsWith(s);
		
		//3. Instance methods on an instance to be determined at runtime
		Predicate<String> methodRef3 = String::isEmpty;// isEmpty does not take any parameters.
		Predicate<String> lambda3 = s -> s.isEmpty();
		
		//Constructors
		Supplier<ArrayList<String>> methodRef4 = ArrayList<String>::new;
		Supplier<ArrayList<String>> lambda4 = () -> new ArrayList<String>();
	}
}
