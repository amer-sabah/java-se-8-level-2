package jo.secondstep.javase8.level2.concurrency.ex4;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Managing Concurrent Processes
		// Applying the Fork/Join Framework
		
		Double[] weights = new Double[10];
		
		ForkJoinTask<?> task = new WeighAnimalAction(weights,0,weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		
		pool.invoke(task);
		
		// Print results
		System.out.println();
		System.out.print("Weights: ");
		Arrays.asList(weights).stream().forEach(
		d -> System.out.print(d.intValue()+" "));
	}
}
