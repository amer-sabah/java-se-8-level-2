package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.List;
import java.util.Map;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client8 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using New Java 8 Map APIs (computeIfPresent, computeIfAbsent)

		EmployeeService employeeService = new EmployeeService();

		List<Employee> employees = employeeService.getEmployees();

		Map<Employee, Integer> salaries = employeeService.getSalaries();

		employeeService.printSalaries(salaries);

		salaries.computeIfPresent(employees.get(3), (e, s) -> s + 30);

		System.out.println("==================================");

		employeeService.printSalaries(salaries);

		salaries.computeIfAbsent(employees.get(5), k -> 100);

		System.out.println("==================================");

		employeeService.printSalaries(salaries);

	}
}
