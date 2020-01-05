package jo.secondstep.javase8.level2.concurrency.ex3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client {
	
	private static int normalCounter = 0;
	private static AtomicInteger atomicCounter = new AtomicInteger(0);

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Synchronizing Data Access
		// Protecting Data with Atomic Classes
		
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100000; i++) {
					normalCounter++;
					atomicCounter.incrementAndGet();
				}
				
				System.out.println("T1 >> Done");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100000; i++) {
					normalCounter++;
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
		
		System.out.println(atomicCounter.get());
		atomicCounter.set(5);
		System.out.println(atomicCounter.getAndSet(8));
		System.out.println(atomicCounter.get());
		System.out.println(atomicCounter.incrementAndGet());
		System.out.println(atomicCounter.get());
		System.out.println(atomicCounter.getAndIncrement());
		System.out.println(atomicCounter.get());
		System.out.println(atomicCounter.decrementAndGet());
		System.out.println(atomicCounter.get());
		System.out.println(atomicCounter.getAndDecrement());
		System.out.println(atomicCounter.get());
		
		AtomicBoolean atomicBoolean = new AtomicBoolean(false);
		atomicBoolean.set(true);
		
		AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(new int[100]);
		atomicIntegerArray.set(5, 10);
		
		AtomicLong atomicLong = new AtomicLong(5);
		atomicLong.incrementAndGet();
		
		AtomicLongArray atomicLongArray = new AtomicLongArray(8);
		atomicLongArray.set(7,  11);
		
		EmployeeService employeeService = new EmployeeService();
		AtomicReference<Employee> atomicReference = new AtomicReference<Employee>(employeeService.getEmployees().get(0));
		atomicReference.getAndSet(employeeService.getEmployees().get(1));
	}
}
