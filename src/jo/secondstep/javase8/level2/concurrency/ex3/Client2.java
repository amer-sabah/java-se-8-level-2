package jo.secondstep.javase8.level2.concurrency.ex3;

import java.util.concurrent.atomic.AtomicInteger;

public class Client2 {
	
	private static int normalCounter = 0;
	private static AtomicInteger atomicCounter = new AtomicInteger(0);

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Improving Access with Synchronized Blocks
		// Synchronizing Methods
		
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100000; i++) {
					
					synchronized (Client2.class) {
						normalCounter++;
					}
					
					atomicCounter.incrementAndGet();
				}
				
				System.out.println("T1 >> Done");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100000; i++) {
					
					incrementNormalCounter();
					
					atomicCounter.incrementAndGet();
				}
				
				System.out.println("T2 >> Done");
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("normalCounter = " + normalCounter);
		System.out.println("atomicCounter = " + atomicCounter.get());
		
	}
	
	private static synchronized void incrementNormalCounter() {
		normalCounter++;
	}
}
