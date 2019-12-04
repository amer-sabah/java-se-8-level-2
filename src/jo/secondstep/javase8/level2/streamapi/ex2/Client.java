package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.List;
import java.util.Map;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// filter()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		Map<Employee, String> departments = employeeService.getDepartments();
		
		long count = employees.stream().filter(e -> departments.get(e).equals("Human Resources")).count();
		
		System.out.printf("%d employees in 'Human Resources' department\n", count);
		employees.stream().filter(e -> departments.get(e).equals("Human Resources")).forEach(e-> System.out.println(e.getName()));
	}
}
