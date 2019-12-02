package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.List;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;

public class Client7 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// forEach()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		employees.stream().forEach(System.out::println);
		
	}
}
