package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;

public class Client9 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using New Java 8 Map APIs - Test All Cases (merge ,computeIfPresent, computeIfAbsent)

		Map<String, Integer> data = new HashMap<>();
		
//		data.put("Amer", 333);
//		data.put("Amer", null);
		
		data.forEach((k,v) -> System.out.println(k + " ==> " + v));
		System.out.println("==================================");
		
		//Test Start
		
		data.merge("Amer", 444, (v1, v2) -> 999);
//		data.merge("Amer", 444, (v1, v2) -> null);
		
//		data.computeIfAbsent("Amer", k -> 999);
//		data.computeIfAbsent("Amer", k -> null);
		
//		data.computeIfPresent("Amer", (k,v) -> 999);
//		data.computeIfPresent("Amer", (k,v) -> null);
		
		//Test End
		
		data.forEach((k,v) -> System.out.println(k + " ==> " + v));
	}
}
