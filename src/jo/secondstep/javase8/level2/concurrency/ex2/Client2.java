package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jo.secondstep.javase8.level2.EmployeeService;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Introducing the Single-Thread Executor
		// ExecutorService life cycle
		
		EmployeeService employeeService = new EmployeeService();
		
		final ExecutorService service = Executors.newSingleThreadExecutor();
		
		try {
			System.out.println("<< start >>");
			
			new Thread("Our Thread") {
				public void run() {
					service.execute(() -> employeeService.getEmployees().stream().filter(e -> e.getAge() < 23)
							.forEach(System.out::println));

					service.execute(() -> employeeService.getDepartments().values().stream().distinct().limit(3)
							.forEach(System.out::println));
					
					service.execute(new Runnable() {
						
						@Override
						public void run() {
							System.out.println(">> isShutdown (1) << = "+ service.isShutdown());
							System.out.println(">> isTerminated (1) << = "+ service.isTerminated());
						}
					});
				};
			}.start();

			System.out.println(">> end <<");
		} finally {
			if (service != null) {
				
				System.out.println(">> isShutdown (2) << = "+ service.isShutdown());
				service.shutdown();
				System.out.println(">> shutdown <<");
				System.out.println(">> isShutdown (3) << = "+ service.isShutdown());
				System.out.println(">> isTerminated (2) << = "+ service.isTerminated());
			}
		}
	}
}
