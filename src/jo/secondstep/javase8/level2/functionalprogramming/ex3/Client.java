package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.List;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;
import jo.secondstep.javase8.level2.functionalprogramming.EmployeeService;

public class Client {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Comparator with Lambdas
		
		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
//		//Without Lambdas
//		employees.sort(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				return e1.getAge() - e2.getAge(); // ascending  sort
//			}
//		});
		
		
		employees.sort((e1,e2) -> e1.getAge() - e2.getAge()); // ascending  sort
//		employees.sort((e1,e2) -> e2.getAge() - e1.getAge()); // descending sort
		
		employeeService.printEmployees(employees);
		
	}

}
