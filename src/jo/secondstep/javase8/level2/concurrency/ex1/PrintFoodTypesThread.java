package jo.secondstep.javase8.level2.concurrency.ex1;

import jo.secondstep.javase8.level2.EmployeeService;

public class PrintFoodTypesThread extends Thread {
	
	private final EmployeeService employeeService;

	public PrintFoodTypesThread(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@Override
	public void run() {
		employeeService.getFavouriteFoodTypes().values().stream().flatMap(e -> e.stream()).distinct().forEach(System.out::println);
	}
}
