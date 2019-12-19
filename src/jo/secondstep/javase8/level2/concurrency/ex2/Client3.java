package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// Introducing the Single-Thread Executor
		// Submitting Tasks
		
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();

			System.out.println("<< start >>");
			
			Future<?> submit = service.submit(new Runnable() {
				
				@Override
				public void run() {
					
					for(int i = 0; i < 10;i++) {
						System.out.println(i);
					}
				}
			});
			
			new Thread("Our Thread 1") {

				public void run() {
					System.out.println(">> start (Our Thread 1) <<");
					
					submit.cancel(false);
					System.out.println(">> cancel <<");
					
					System.out.println(">> end (Our Thread 1) <<");
				}

			}.start();
			
			new Thread("Our Thread 2") {

				public void run() {
					System.out.println(">> start (Our Thread 2) <<");
					
					System.out.println(">> isCancelled << = "+ submit.isCancelled());
					System.out.println(">> isDone << = "+ submit.isDone());
					
					System.out.println(">> end (Our Thread 2) <<");
				}

			}.start();
			
			new Thread("Our Thread 3") {

				public void run() {
					System.out.println(">> start (Our Thread 3) <<");
					
					System.out.println(">> isCancelled << = "+ submit.isCancelled());
					System.out.println(">> isDone << = "+ submit.isDone());
					
					System.out.println(">> end (Our Thread 3) <<");
				}

			}.start();

			System.out.println(">> end <<");
		} finally {
			if (service != null) {
				service.shutdown();
				System.out.println(">> shutdown <<");
			}

		}
	}
}
