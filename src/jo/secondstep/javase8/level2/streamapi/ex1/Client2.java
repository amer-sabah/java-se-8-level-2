package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.List;
import java.util.stream.Stream;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// count()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		Stream<Employee> employeeStream = employees.stream();
		
		System.out.printf("employeeStream -> %s\n", employeeStream.count());
	}
}
