package jo.secondstep.javase8.level2.concurrency.ex1;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Polling with Sleep
		
		EmployeeService employeeService = new EmployeeService();

		System.out.println("Started..");
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(Employee employee: employeeService.getEmployees()) {
					System.out.println(employee.getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		System.out.println("Ended..");
	}
}
