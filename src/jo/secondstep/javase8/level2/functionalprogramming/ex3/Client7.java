package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.List;
import java.util.Map;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client7 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using New Java 8 Map APIs (putIfAbsent, merge)

		EmployeeService employeeService = new EmployeeService();

		List<Employee> employees = employeeService.getEmployees();

		Map<String, Employee> tasks = employeeService.getTasks();

		employeeService.printTasks(tasks);

		tasks.putIfAbsent("SC-3424", employees.get(10));
		tasks.putIfAbsent("SC-9999", employees.get(11));
		tasks.putIfAbsent("SC-5555", employees.get(12));

		System.out.println("==================================");

		employeeService.printTasks(tasks);

		tasks.merge("SC-2222", employees.get(13),
				(e1, e2) -> e1.getAge() > e2.getAge()? e1 : e2);
		
		System.out.println("==================================");
		
		employeeService.printTasks(tasks);
	}
}
