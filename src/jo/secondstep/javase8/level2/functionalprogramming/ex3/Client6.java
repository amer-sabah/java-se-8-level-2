package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.Arrays;
import java.util.List;

public class Client6 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Updating All Elements

		List<Integer> list = Arrays.asList(1, 2, 3);
		list.replaceAll(x -> x*2);
		System.out.println(list); // [2, 4, 6]
	}
}
