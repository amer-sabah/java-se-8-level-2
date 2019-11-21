package jo.secondstep.javase8.level2.functionalprogramming.ex2;

import java.util.List;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Applying the Predicate Interface

		EmployeeService employeeService = new EmployeeService();

		// All employees
		System.out.println(">>>>>>>>>> All employees >>>>>>>>>>");
		List<Employee> allEmployees = employeeService.getEmployees();
		employeeService.printEmployees(allEmployees);

		// Filtered employees
		System.out.println(">>>>>>>>>> Filtered employees >>>>>>>>>>");
		List<Employee> filteredEmployees = employeeService.findEmployees(e -> e.getAge() > 35);
		employeeService.printEmployees(filteredEmployees);

		// After removing filtered employees
		System.out.println(">>>>>>>>>> After removing filtered employees >>>>>>>>>>");
		allEmployees.removeIf(e -> e.getAge() > 35);
		employeeService.printEmployees(allEmployees);

	}
}
