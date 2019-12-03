package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.List;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client5 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// allMatch() , anyMatch() and noneMatch()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		System.out.println(employees.stream().allMatch(e -> e.getAge() > 30));
		System.out.println(employees.stream().anyMatch(e -> e.getAge() == 50));
		System.out.println(employees.stream().noneMatch(e -> e.getAge() == 33));
		
	}
}
