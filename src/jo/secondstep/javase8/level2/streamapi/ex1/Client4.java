package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.Arrays;
import java.util.List;

public class Client4 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// findAny() and findFirst()

		List<String> colors = Arrays.asList("Red","Black","Blue","Green", "Orange", "Yellow", "White");
		
		colors.stream().findFirst().ifPresent(System.out::println);
		colors.stream().findAny().ifPresent(System.out::println);
		
	}
}
