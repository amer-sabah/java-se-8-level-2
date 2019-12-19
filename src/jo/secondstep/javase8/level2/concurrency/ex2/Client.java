package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jo.secondstep.javase8.level2.EmployeeService;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Introducing the Single-Thread Executor
		
		EmployeeService employeeService = new EmployeeService();
		
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			
			System.out.println("<< start >>");
			
			service.execute(() -> employeeService.getEmployees().stream()
					.filter(e -> e.getAge() < 23)
					.forEach(System.out::println));
			
			service.execute(() -> employeeService.getDepartments().values().stream()
					.distinct()
					.limit(3)
					.forEach(System.out::println));

			System.out.println(">> end <<");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
