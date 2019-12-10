package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.List;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client7 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// sorted()


		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		employees.stream().sorted().forEach(System.out::println);
		
		System.out.println("-----------------------------------");
		
		employees.stream()
		.sorted((e1, e2) -> e2.getAge() - e1.getAge())
		.forEach(System.out::println);
	}
}
