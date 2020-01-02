package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client6 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Waiting for All Tasks to Finish

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(() -> System.out.println("Hello"));
		executorService.execute(() -> System.out.println("Hello2"));
		executorService.execute(() -> System.out.println("Hello3"));
		executorService.execute(() -> System.out.println("Hello4"));
		executorService.execute(() -> System.out.println("Hello5"));

		executorService.shutdown();

		try {
			executorService.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (executorService.isTerminated()) {
			System.out.println("All tasks are done");
		} else {
			System.out.println("Still we have at least one task running");
		}

	}
}
