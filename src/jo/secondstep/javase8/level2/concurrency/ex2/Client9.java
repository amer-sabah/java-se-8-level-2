package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Client9 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Increasing Concurrency with Pools
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		ExecutorService executorService2 = Executors.newFixedThreadPool(5);
		
		ExecutorService executorService3 = Executors.newCachedThreadPool();
		
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		
		ScheduledExecutorService scheduledExecutorService2 = Executors.newScheduledThreadPool(5);
		
		executorService.shutdown();
		executorService2.shutdown();
		executorService3.shutdown();
		scheduledExecutorService.shutdown();
		scheduledExecutorService2.shutdown();
		
		System.out.println("Done");
	}
}
