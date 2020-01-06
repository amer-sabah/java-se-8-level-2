package jo.secondstep.javase8.level2.concurrency.ex4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Managing Concurrent Processes
		// Applying the Fork/Join Framework
		// Working with a RecursiveTask

		Double[] weights = new Double[10];

		ForkJoinTask<Double> task = new WeighAnimalTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: " + sum);
	}
}
