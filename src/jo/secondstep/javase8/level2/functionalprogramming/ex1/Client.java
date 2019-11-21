package jo.secondstep.javase8.level2.functionalprogramming.ex1;

public class Client {

	public static void main(String[] args) {

		// >>>>>>>>>>>>>>>>>>>>>>>> Items >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// Implementing Functional Interfaces with Lambdas
		// Understanding Lambda Syntax
		// Spotting Invalid Lambdas

		// Lambda syntax
		// a −> a.canHop() or (Animal a) −> { return a.canHop(); }

		// Spotting Invalid Lambdas
		// uck d -> d.quack() // DOES NOT COMPILE
		// a,d -> d.quack() // DOES NOT COMPILE
		// Animal a, Duck d -> d.quack() // DOES NOT COMPILE

		StudentEnrollmentService studentEnrollmentService = new StudentEnrollmentService();
		Student student = new Student();

		student.setId(55);

		studentEnrollmentService.enroll(student, new StudentIdNotEmpty());

		studentEnrollmentService.enroll(student, s -> ((Student) s).getId() != 0);

	}
}
