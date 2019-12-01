package jo.secondstep.javase8.level2.functionalprogramming.ex4;

import java.util.Optional;

public class Client11 {
	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Returning an Optional
		
		System.out.println(average(90, 100)); 
		System.out.println(average());
		System.out.println(average(90, 100).get());
		
		if(average().isPresent()) {
			System.out.println("Present:Yes");
		} else {
			System.out.println("Present:No");
		}
		
		average(111).ifPresent(System.out::println);
		
		Optional<Double> opt = average();
		System.out.println(opt.orElse(Double.NaN));
		System.out.println(opt.orElseGet(() -> Math.random()));
		System.out.println(opt.orElseThrow(() -> new IllegalStateException()));

	}

	public static Optional<Double> average(int... scores) {

		if (scores.length == 0) {
			return Optional.empty();
		}

		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		return Optional.of((double) sum / scores.length);
	}

}
