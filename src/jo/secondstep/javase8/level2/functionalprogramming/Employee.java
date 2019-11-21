package jo.secondstep.javase8.level2.functionalprogramming;

public class Employee {

	private int id;

	private String employeeName;

	private String city;

	private int age;

	public Employee(int id, String employeeName, String city, int age) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.city = city;
		this.age = age;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", city=" + city + ", age=" + age + "]";
	}

}
