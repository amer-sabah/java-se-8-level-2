package jo.secondstep.javase8.level2.functionalprogramming.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Presenting the New Stream Methods
		// Walking a Directory

		Path path = Paths.get("./");
		try {
			Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
