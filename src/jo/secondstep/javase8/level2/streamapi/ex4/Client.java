package jo.secondstep.javase8.level2.streamapi.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Advanced Stream Pipeline Concepts
		// Linking Streams to the Underlying Data
		
		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");

		Stream<String> stream = colors.stream();

		colors.add("Orange");

		System.out.println(stream.count());
		
	}
}
