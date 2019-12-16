package jo.secondstep.javase8.level2.streamapi.ex4;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client4 {

	public static void main(String[] args) {
		
		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Advanced Stream Pipeline Concepts
		// Collecting Results
		// Collecting into Maps
		
		Stream<String> animals = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = animals.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map);
		
		//BAD
//		Stream<String> animals2 = Stream.of("lions", "tigers", "bears");
//		Map<Integer, String> map2 = animals2.collect(Collectors.toMap(String::length, k -> k));
//		System.out.println(map2);
		
		Stream<String> animals3 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map3 = animals3.collect(Collectors.toMap(
		String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map3);
		System.out.println(map3.getClass());
		
		Stream<String> animals4 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, String> map4 = animals4.collect(Collectors.toMap(
		String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(map4);
		System.out.println(map4.getClass());
	}
}
