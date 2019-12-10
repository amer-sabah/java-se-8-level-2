package jo.secondstep.javase8.level2.streamapi.ex3;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Summarizing Statistics
		//

		IntStream ints = IntStream.of(1, 2, 3, 4, 5, 6);
		IntSummaryStatistics stats = ints.summaryStatistics();
		
		if (stats.getCount() == 0) {
			System.out.println("Empty");
		} else {
			System.out.println(stats.getMax() - stats.getMin());
		}
	 
	}
}
