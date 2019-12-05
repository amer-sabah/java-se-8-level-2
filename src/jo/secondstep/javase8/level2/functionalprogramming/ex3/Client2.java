package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.List;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;
import jo.secondstep.javase8.level2.EmployeeUtils;

public class Client2 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Method References
		
		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		
		employees.sort((e1, e2) -> EmployeeUtils.compareByAge(e1, e2));
		
		//The :: operator tells Java to pass the parameters automatically into compareByAge
		employees.sort(EmployeeUtils::compareByAge); 
		
		employeeService.printEmployees(employees);
		

	}

}
