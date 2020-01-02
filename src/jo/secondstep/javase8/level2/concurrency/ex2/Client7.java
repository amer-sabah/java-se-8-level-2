package jo.secondstep.javase8.level2.concurrency.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client7 {

	public static void main(String[] args) {
		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Creating Threads with the ExecutorService
		// invokeAll and invokeAny
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		List<Callable<Integer>> tasks = new ArrayList<>();
		
		tasks.add(()-> {System.out.println(1); return 1;});
		tasks.add(()-> {System.out.println(2); return 2;});
		tasks.add(()-> {System.out.println(3); return 3;});
		tasks.add(()-> {System.out.println(4); return 4;});
		tasks.add(()-> {System.out.println(5); return 5;});

		
		try {
			List<Future<Integer>> futures = executorService.invokeAll(tasks);
			System.out.println(futures.get(0).isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			Integer value = executorService.invokeAny(tasks);
			System.out.println(value);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
}
