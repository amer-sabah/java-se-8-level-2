package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.Arrays;
import java.util.List;

public class Client4 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// skip()

		List<String> colors = Arrays.asList("Red", "Black", "Blue", "Green", "Orange", "Yellow", "White");

		colors.stream().skip(2).forEach(System.out::println);
	}
}
