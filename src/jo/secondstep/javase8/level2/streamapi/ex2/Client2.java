package jo.secondstep.javase8.level2.streamapi.ex2;

import java.util.Arrays;
import java.util.List;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Intermediate Operations
		// distinct()

		List<String> colors = Arrays.asList("Red","Black","Blue","Green", "Orange", "Yellow", "White", "Black","Blue");
		
		colors.stream().forEach(System.out::println);
		
		System.out.println("======================================");
		
		List<String> colors2 = Arrays.asList("Red","Black","Blue","Green", "Orange", "Yellow", "White", "Black","Blue");
		
		colors2.stream().distinct().forEach(System.out::println);
	}
}
