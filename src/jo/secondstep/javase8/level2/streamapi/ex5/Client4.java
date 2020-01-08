package jo.secondstep.javase8.level2.streamapi.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client4 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Presenting the New Stream Methods
		// Printing File Contents

		Path path = Paths.get(".\\src\\jo\\secondstep\\javase8\\level2\\functionalprogramming\\ex5\\Client4.java");
		try {
		Files.lines(path).forEach(System.out::println);
		} catch (IOException e) {
		// Handle file I/O exception...
		}
	}

}
