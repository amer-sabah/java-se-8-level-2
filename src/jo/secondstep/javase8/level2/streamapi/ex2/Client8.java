package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.List;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client8 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// peek()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		employees.stream()
		.peek(e -> System.out.println("peek>> " + e.getName()))
		.forEach(e -> System.out.println("forEach>> " + e.getName()));
		
		System.out.println("----------------------------");
		
		long count = employees.stream()
		.peek(e -> System.out.println("peek>> " + e.getName()))
		.count();
		
		System.out.println("count>> " + count);
	}
}
