package jo.secondstep.javase8.level2.concurrency.ex1;

import jo.secondstep.javase8.level2.EmployeeService;

public class PrintEmployeeNamesJob implements Runnable {

	private final EmployeeService employeeService;

	public PrintEmployeeNamesJob(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@Override
	public void run() {
		employeeService.getEmployees().forEach(e -> System.out.println(e.getName()));
	}

}
