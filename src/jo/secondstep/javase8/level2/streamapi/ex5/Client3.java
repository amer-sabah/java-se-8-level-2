package jo.secondstep.javase8.level2.streamapi.ex5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Client3 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Presenting the New Stream Methods
		// Listing Directory Contents

		try {
			Path path = Paths.get("./");
			Files.list(path).filter(p -> !Files.isDirectory(p)).map(p -> p.toAbsolutePath())
					.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
