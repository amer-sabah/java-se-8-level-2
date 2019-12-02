package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.List;
import java.util.Optional;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;
import jo.secondstep.javase8.level2.functionalprogramming.ex3.EmployeeUtils;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// min() and max()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		Optional<Employee> youngestEmployee = employees.stream().min(EmployeeUtils::compareByAge);
		Optional<Employee> oldestEmployee = employees.stream().max(EmployeeUtils::compareByAge);
		
		youngestEmployee.ifPresent(System.out::println);
		oldestEmployee.ifPresent(System.out::println);
	}
}
