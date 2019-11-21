package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import java.util.Arrays;
import java.util.List;

public class Client5 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Looping through a Collection

		List<String> cats = Arrays.asList("Annie", "Ripley");
		cats.forEach(c -> System.out.println(c));
	}
}
