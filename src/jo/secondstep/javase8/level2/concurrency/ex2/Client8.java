package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Client8 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Scheduling Tasks
		
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		
		ScheduledFuture<Integer> schedule = scheduledExecutorService.schedule(() -> {System.out.println(1);return 1;}, 3, TimeUnit.SECONDS);
		
		try {
			System.out.println("Value = " + schedule.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		scheduledExecutorService.schedule(() -> System.out.println(2), 6, TimeUnit.SECONDS);
		
		scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println(3), 8, 2, TimeUnit.SECONDS);
		
		scheduledExecutorService.scheduleWithFixedDelay(()-> System.out.println(4), 10, 3, TimeUnit.SECONDS);
	}
}
