package jo.secondstep.javase8.level2.functionalprogramming.ex1;

public class Client {

	public static void main(String[] args) {
		
		StudentEnrollmentService studentEnrollmentService = new StudentEnrollmentService();
		Student student = new Student();
		
		student.setId(55);
				
		studentEnrollmentService.enroll(student, new StudentIdNotEmpty());
		
		studentEnrollmentService.enroll(student, s -> ((Student)s).getId() != 0);
		
	}
}
