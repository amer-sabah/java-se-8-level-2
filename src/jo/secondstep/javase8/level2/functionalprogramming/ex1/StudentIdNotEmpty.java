package jo.secondstep.javase8.level2.functionalprogramming.ex1;

public class StudentIdNotEmpty implements Validator {

	@Override
	public boolean isValid(Fact fact) {

		Student student = (Student) fact;

		if (student.getId() == 0) {
			return false;
		}
		
		return true;
	}

}
