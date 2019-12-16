package jo.secondstep.javase8.level2.streamapi.ex4;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client3 {

	public static void main(String[] args) {
		
		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Advanced Stream Pipeline Concepts
		// Collecting Results
		// Collecting Using Basic Collectors
		
		Stream<String> animals = Stream.of("lions", "tigers", "bears");
		String result = animals.collect(Collectors.joining(", ",">>","<<"));
		System.out.println(result);
		
		Stream<String> animals2 = Stream.of("lions", "tigers", "bears");
		Double result2 = animals2.collect(Collectors.averagingInt(String::length));
		System.out.println(result2); 
		
		Stream<String> animals3 = Stream.of("lions", "tigers", "bears");
		TreeSet<String> result3 = animals3.filter(s -> s.startsWith("t"))
				.collect(Collectors.toCollection(TreeSet<String>::new));
		System.out.println(result3);
	}
}
