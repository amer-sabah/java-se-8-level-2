package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.ArrayList;
import java.util.List;

public class Client4 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Removing Conditionally

		List<String> list = new ArrayList<>();
		list.add("Magician");
		list.add("Assistant");
		System.out.println(list); // [Magician, Assistant]
		list.removeIf(s -> s.startsWith("A"));
		System.out.println(list); // [Magician]
	}
}
