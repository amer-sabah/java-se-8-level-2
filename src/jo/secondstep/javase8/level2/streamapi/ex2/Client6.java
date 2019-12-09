package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.List;
import java.util.Map;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client6 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// flatMap()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		Map<Employee, String> departments = employeeService.getDepartments();
		
		Map<Employee, List<String>> favouriteFoodTypes = employeeService.getFavouriteFoodTypes();
		
		employees.stream()
		.filter(e -> departments.get(e).equals("Human Resources"))
		.flatMap(e -> favouriteFoodTypes.get(e).stream())
		.distinct()
		.forEach(System.out::println);
	}
}
