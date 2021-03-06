package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client7 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// reduce()

		EmployeeService employeeService = new EmployeeService();
		
		Map<String, Employee> tasks = employeeService.getTasks();
		
		Map<Employee, Integer> salaries = employeeService.getSalaries();
		
		String taskReport = tasks.keySet().stream().reduce("", (t1,t2) -> t1 + t2 + "\n");
		
		System.out.print(taskReport);
		
		Optional<Integer> totalSalaries = salaries.values().stream().reduce((s1, s2) -> s1 + s2);
		
		totalSalaries.ifPresent(System.out::println);
		
		BinaryOperator<Integer> operation = (s1, s2) -> s1 + s2;
		int totalSalariesParallel = salaries.values().stream().reduce(0, operation, operation);
		
		System.out.println(totalSalariesParallel);
	}
}
