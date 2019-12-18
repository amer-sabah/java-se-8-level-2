package jo.secondstep.javase8.level2.concurrency.ex1;

import jo.secondstep.javase8.level2.EmployeeService;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating a Thread

		EmployeeService employeeService = new EmployeeService();
		
		//Print employee names
		System.out.println(">>> Print employee names <<<");
		Runnable printEmployeeNamesJob = () -> employeeService.getEmployees().forEach(e -> System.out.println("* " + e.getName()));
		Thread printEmployeeNamesThread = new Thread(printEmployeeNamesJob);		
		
		//Print departments
		System.out.println(">>> Print departments <<<");
		Runnable printDepartmentsJob = () -> employeeService.getDepartments().values().stream().distinct().forEach(System.out::println);
		Thread printDepartmentsThread = new Thread(printDepartmentsJob);
		
		//Print food types
		System.out.println(">>> Print food types <<<");
		Thread printFoodTypesThread = new PrintFoodTypesThread(employeeService);
		
		//Print numbers
		System.out.println(">>> Print numbers <<<");
		Thread printInfiniteNumbers = new PrintNumbersThread();
		
		printInfiniteNumbers.start();
		printEmployeeNamesThread.start();
		printFoodTypesThread.start();
		printDepartmentsThread.start();
		
	}
}
