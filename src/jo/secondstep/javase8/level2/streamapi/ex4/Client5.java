package jo.secondstep.javase8.level2.streamapi.ex4;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client5 {

	public static void main(String[] args) {
		
		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Advanced Stream Pipeline Concepts
		// Collecting Results
		// Collecting Using Grouping, Partitioning, and Mapping
		
		
		System.out.println("======================(1)======================");
		
		Stream<String> animals = Stream.of("lions", "lions", "tigers", "bears");
		Map<Integer, List<String>> map = animals.collect(
		Collectors.groupingBy(String::length));
		System.out.println(map); 
		
		System.out.println("======================(2)======================");
		
		Stream<String> animals2 = Stream.of("lions", "lions", "tigers", "bears");
		Map<Integer, Set<String>> map2 = animals2.collect(
		Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(map2);
		
		System.out.println("======================(3)======================");
		
		Stream<String> animals3 = Stream.of("lions", "lions", "tigers", "bears");
		TreeMap<Integer, Set<String>> map3 = animals3.collect(
		Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(map3); 
		
		System.out.println("======================(4)======================");
		
		Stream<String> animals4 = Stream.of("lions", "lions", "tigers", "bears");
		TreeMap<Integer, List<String>> map4 = animals4.collect(
		Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(map4);
		
		System.out.println("======================(5)======================");
		
		Stream<String> animals5 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map5 = animals5.collect(
		Collectors.partitioningBy(s -> s.length() <= 5));
		System.out.println(map5);
		
		System.out.println("======================(6)======================");
		
		Stream<String> animals6 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> map6 = animals6.collect(
		Collectors.partitioningBy(s -> s.length() <= 7));
		System.out.println(map6); 
		
		System.out.println("======================(7)======================");
		
		Stream<String> animals7 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, Set<String>> map7 = animals7.collect(
		Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
		System.out.println(map7);
		
		System.out.println("======================(8)======================");
		
		Stream<String> animals8 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Long> map8 = animals8.collect(Collectors.groupingBy(
		String::length, Collectors.counting()));
		System.out.println(map8);
		
		System.out.println("======================(9)======================");
		
		Stream<String> animals9 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<String>> map9 = animals9.collect(
		Collectors.groupingBy(
		String::length,
		Collectors.mapping(s -> s,
		Collectors.minBy(Comparator.naturalOrder()))));
		System.out.println(map9);
				
	}
}
