package jo.secondstep.javase8.level2.functionalprogramming.ex1;

public class StudentEnrollmentService {

	public int enroll(Student student, Validator validator) {
		
		System.out.println("Student enrollment proccess is started");
		
		boolean valid = validator.isValid(student);
		
		if(!valid) {
			System.out.println("Student enrollment process is cancelled");
			return -1;
		}
		
		System.out.println("Student enrollment proccess is finished");
		
		return 44;// return enrollment id (Now it is hard coded)
	}
}
