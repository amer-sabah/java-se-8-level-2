package jo.secondstep.javase8.level2.streamapi.ex5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Client2 {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Presenting the New Stream Methods
		// Searching a Directory

		Path path = Paths.get("./");
		long dateFilter = 1420070400000l;
		Stream<Path> stream = null;
		
		try {
			stream = Files.find(path, 7,
					(p, a) -> p.toString().endsWith(".java") && a.lastModifiedTime().toMillis() > dateFilter);
			stream.forEach(System.out::println);
		} catch (Exception e) {
			if(stream != null) {
				stream.close();
			}
		}
	}

}
