package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client6 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Scheduling Tasks
		
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();

			System.out.println("<< start >>");

			Future<Integer> submit = service.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {

					int i = 0;
					for (; i < 10; i++) {
						System.out.println(i);
					}

					return i;
				}
			});
			
			new Thread("Our Thread") {

				public void run() {
					System.out.println(">> start (Our Thread) <<");
					
					try {
						System.out.println(">> get << = "+ submit.get());
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (ExecutionException e) {
						e.printStackTrace();
					}
					
					
					System.out.println(">> end (Our Thread 4) <<");
				}

			}.start();
		} finally {
			if (service != null) {
				service.shutdown();
				System.out.println(">> shutdown <<");

			}
		}
		
	}
}
