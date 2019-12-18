package jo.secondstep.javase8.level2.concurrency.ex1;

import jo.secondstep.javase8.level2.EmployeeService;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Introducing Runnable
		
		EmployeeService employeeService = new EmployeeService();
		
		PrintEmployeeNamesJob employeeNamesJob = new PrintEmployeeNamesJob(employeeService);
		
		//Print employee names
		System.out.println(">>> Print employee names <<<");
		employeeNamesJob.run();
		
		//Print departments
		System.out.println(">>> Print departments <<<");
		new Runnable() {
			
			@Override
			public void run() {
				
				employeeService.getDepartments().values().stream().distinct().forEach(System.out::println);
				
			}
		}.run();

		
		//Print food types
		System.out.println(">>> Print food types <<<");
		Runnable printFoodTypesJob = () -> employeeService.getFavouriteFoodTypes().values().stream().flatMap(e -> e.stream()).distinct().forEach(System.out::println);
		printFoodTypesJob.run();
	}
}
