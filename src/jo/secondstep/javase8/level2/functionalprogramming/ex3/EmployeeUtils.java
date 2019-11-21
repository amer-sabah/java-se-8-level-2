package jo.secondstep.javase8.level2.functionalprogramming.ex3;

import jo.secondstep.javase8.level2.functionalprogramming.Employee;

public class EmployeeUtils {

	public static int compareByAge(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}

	public static int compareByName(Employee e1, Employee e2) {
		return e1.getEmployeeName().compareToIgnoreCase(e2.getEmployeeName());
	}
}
