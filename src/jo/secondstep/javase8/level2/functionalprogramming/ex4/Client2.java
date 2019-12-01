package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Client2 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Built-In Functional Interfaces 
		// Implementing Supplier 
		// Supplier<T>
		// +----------------------------------------------------------------------------+
		// | Functional Interfaces | #Parameters | Return Type | Single Abstract Method |
		// +----------------------------------------------------------------------------+
		// | Supplier<T>           | 0           | T           | get                    |
		// +----------------------------------------------------------------------------+
		
		
		Supplier<LocalDate> dateSupplier1 = LocalDate::now;
		Supplier<LocalDate> dateSupplier2 = () -> LocalDate.now();
		
		Supplier<ArrayList<String>> listProvider = ArrayList<String>::new;
		ArrayList<String> list = listProvider.get();
		list.add("Test");
		
		System.out.println(dateSupplier1.get());
		System.out.println(dateSupplier2.get());
		System.out.println(list);
	}

}
