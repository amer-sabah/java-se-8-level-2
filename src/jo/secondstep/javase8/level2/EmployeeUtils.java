package jo.secondstep.javase8.level2;

public class EmployeeUtils {

	public static int compareByAge(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}

	public static int compareByName(Employee e1, Employee e2) {
		return e1.getName().compareToIgnoreCase(e2.getName());
	}
}
