package jo.secondstep.javase8.level2.streamapi.ex1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jo.secondstep.javase8.level2.Employee;
import jo.secondstep.javase8.level2.EmployeeService;

public class Client8 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Using Common Terminal Operations
		// collect()

		EmployeeService employeeService = new EmployeeService();
		
		List<Employee> employees = employeeService.getEmployees();
		
		Map<Employee, Integer> salaries = employeeService.getSalaries();
		
		Map<Employee, String> departments = employeeService.getDepartments();
		
		Supplier<HashMap<String, Integer>> supplier = HashMap<String, Integer>::new;
		BiConsumer<HashMap<String, Integer>, ? super Employee> accumulator = (m, e) -> m.merge(departments.get(e), salaries.get(e) == null ? 0 : salaries.get(e),(s1, s2) -> s1 + s2);
		BiConsumer<HashMap<String, Integer>, HashMap<String, Integer>> combiner = (m1, m2) -> m2.forEach((k, v) -> m1.merge(k, v, (s1, s2) -> s1 + s2));
		
		HashMap<String, Integer> result = employees.parallelStream().collect(supplier,accumulator,combiner);
		
		result.forEach((k, v) -> System.out.printf("%s -> %d\n", k, v));
		
		System.out.println("==================================================");
		
		Stream<String> stream1 = Stream.of("w", "o", "l", "f", "f", "o");
		TreeSet<String> set1 = stream1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(set1);

		Stream<String> stream2 = Stream.of("w", "o", "l", "f", "f", "o");

		TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set2);
	}
}
