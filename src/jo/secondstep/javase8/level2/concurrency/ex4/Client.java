package jo.secondstep.javase8.level2.concurrency.ex4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Managing Concurrent Processes
		// Creating a CyclicBarrier

		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(4);
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
			CyclicBarrier c3 = new CyclicBarrier(4);
			for (int i = 0; i < 4; i++)
				service.submit(() -> performTask(c1, c2, c3));
		} finally {
			if (service != null)
				service.shutdown();
		}
	
	}
	
	private static void removeAnimals() {
		System.out.println("Removing animals");
	}

	private static void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private static void addAnimals() {
		System.out.println("Adding animals");
	}

	public static void performTask(CyclicBarrier c1, CyclicBarrier c2, CyclicBarrier c3) {
		try {
			removeAnimals();
			c1.await();
			cleanPen();
			c2.await();
			addAnimals();
			c3.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
