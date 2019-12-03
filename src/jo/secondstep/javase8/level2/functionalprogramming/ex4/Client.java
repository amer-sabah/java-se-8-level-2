package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import jo.secondstep.javase8.level2.EmployeeService;

public class Client {

	private int instanceVariable = 25;

	private static int staticVariable = 40;

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Lambda expressions can access static variables, instance variables,
		// effectively final method parameters, and effectively final local variables

		new Client().exe(123);

	}

	private void exe(int methodParamete) {

		final int finalVariable = 27;
		int effectivelyFinalVariable = 30;

		EmployeeService employeeService = new EmployeeService();

		employeeService.findEmployees(e -> e.getAge() > instanceVariable);
		employeeService.findEmployees(e -> e.getAge() > staticVariable);
		employeeService.findEmployees(e -> e.getAge() > methodParamete);
		employeeService.findEmployees(e -> e.getAge() > finalVariable);
		employeeService.findEmployees(e -> e.getAge() > effectivelyFinalVariable);
		
		System.out.println("Done");

	}

}
