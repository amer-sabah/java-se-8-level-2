package jo.secondstep.javase8.level2.streamapi.ex4;

import java.util.Optional;
import java.util.stream.Stream;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Working with Advanced Stream Pipeline Concepts
		// Chaining Optionals

		threeDigit(Stream.of(123).findFirst());
		threeDigitLambda(Stream.of(123).findFirst());
	}

	private static void threeDigit(Optional<Integer> optional) {
		if (optional.isPresent()) { // outer if
			Integer num = optional.get();
			String string = "" + num;
			if (string.length() == 3) // inner if
				System.out.println(string);
		}
	}

	private static void threeDigitLambda(Optional<Integer> optional) {
		optional.map(n -> "" + n) // part 1
				.filter(s -> s.length() == 3) // part 2
				.ifPresent(System.out::println); // part 3
	}
}
