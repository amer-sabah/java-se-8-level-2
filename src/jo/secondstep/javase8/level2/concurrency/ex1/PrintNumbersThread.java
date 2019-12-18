package jo.secondstep.javase8.level2.concurrency.ex1;

import java.util.stream.Stream;

public class PrintNumbersThread extends Thread {

	@Override
	public void run() {
		Stream.iterate(0, s->s+1).forEach(System.out::println);
	}
}
