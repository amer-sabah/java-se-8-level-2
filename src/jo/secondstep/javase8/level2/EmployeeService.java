package jo.secondstep.javase8.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

public class EmployeeService {

	List<Employee> employees = new ArrayList<>();
	Map<String, Employee> tasks = new HashMap<>();
	Map<Employee, Integer> salaries = new HashMap<>();
	Map<Employee, String> departments = new HashMap<>();

	public EmployeeService() {

		initEmployees();

		initTasks();

		initSalaries();
		
		initDepartments();
	}
	
	private void initDepartments() {
		departments.put(employees.get(0),"Customer Service");
		departments.put(employees.get(1),"Legal Department");
		departments.put(employees.get(2),"Customer Service");
		departments.put(employees.get(3),"Tech Support");
		departments.put(employees.get(4),"Asset Management");
		departments.put(employees.get(5),"Asset Management");
		departments.put(employees.get(6),"Payroll");
		departments.put(employees.get(7),"Accounting");
		departments.put(employees.get(8),"Accounting");
		departments.put(employees.get(9),"Quality Assurance");
		departments.put(employees.get(10),"Customer Relations");
		departments.put(employees.get(11),"Asset Management");
		departments.put(employees.get(12),"Media Relations");
		departments.put(employees.get(13),"Asset Management");
		departments.put(employees.get(14),"Customer Service");
		departments.put(employees.get(15),"Media Relations");
		departments.put(employees.get(16),"Research and Development");
		departments.put(employees.get(17),"Sales and Marketing");
		departments.put(employees.get(18),"Public Relations");
		departments.put(employees.get(19),"Public Relations");
		departments.put(employees.get(20),"Public Relations");
		departments.put(employees.get(21),"Customer Service");
		departments.put(employees.get(22),"Advertising");
		departments.put(employees.get(23),"Public Relations");
		departments.put(employees.get(24),"Asset Management");
		departments.put(employees.get(25),"Payroll");
		departments.put(employees.get(26),"Finances");
		departments.put(employees.get(27),"Sales and Marketing");
		departments.put(employees.get(28),"Customer Relations");
		departments.put(employees.get(29),"Research and Development");
		departments.put(employees.get(30),"Legal Department");
		departments.put(employees.get(31),"Research and Development");
		departments.put(employees.get(32),"Tech Support");
		departments.put(employees.get(33),"Advertising");
		departments.put(employees.get(34),"Media Relations");
		departments.put(employees.get(35),"Payroll");
		departments.put(employees.get(36),"Accounting");
		departments.put(employees.get(37),"Finances");
		departments.put(employees.get(38),"Finances");
		departments.put(employees.get(39),"Finances");
		departments.put(employees.get(40),"Customer Relations");
		departments.put(employees.get(41),"Customer Service");
		departments.put(employees.get(42),"Finances");
		departments.put(employees.get(43),"Customer Relations");
		departments.put(employees.get(44),"Research and Development");
		departments.put(employees.get(45),"Customer Relations");
		departments.put(employees.get(46),"Finances");
		departments.put(employees.get(47),"Media Relations");
		departments.put(employees.get(48),"Customer Service");
		departments.put(employees.get(49),"Human Resources");
		departments.put(employees.get(50),"Tech Support");
		departments.put(employees.get(51),"Sales and Marketing");
		departments.put(employees.get(52),"Customer Relations");
		departments.put(employees.get(53),"Media Relations");
		departments.put(employees.get(54),"Sales and Marketing");
		departments.put(employees.get(55),"Human Resources");
		departments.put(employees.get(56),"Quality Assurance");
		departments.put(employees.get(57),"Customer Service");
		departments.put(employees.get(58),"Customer Relations");
		departments.put(employees.get(59),"Customer Relations");
		departments.put(employees.get(60),"Payroll");
		departments.put(employees.get(61),"Research and Development");
		departments.put(employees.get(62),"Media Relations");
		departments.put(employees.get(63),"Human Resources");
		departments.put(employees.get(64),"Customer Service");
		departments.put(employees.get(65),"Tech Support");
		departments.put(employees.get(66),"Sales and Marketing");
		departments.put(employees.get(67),"Payroll");
		departments.put(employees.get(68),"Media Relations");
		departments.put(employees.get(69),"Customer Service");
		departments.put(employees.get(70),"Quality Assurance");
		departments.put(employees.get(71),"Asset Management");
		departments.put(employees.get(72),"Customer Service");
		departments.put(employees.get(73),"Tech Support");
		departments.put(employees.get(74),"Tech Support");
		departments.put(employees.get(75),"Customer Service");
		departments.put(employees.get(76),"Accounting");
		departments.put(employees.get(77),"Asset Management");
		departments.put(employees.get(78),"Human Resources");
		departments.put(employees.get(79),"Customer Relations");
		departments.put(employees.get(80),"Legal Department");
		departments.put(employees.get(81),"Asset Management");
		departments.put(employees.get(82),"Tech Support");
		departments.put(employees.get(83),"Human Resources");
		departments.put(employees.get(84),"Asset Management");
		departments.put(employees.get(85),"Media Relations");
		departments.put(employees.get(86),"Payroll");
		departments.put(employees.get(87),"Payroll");
		departments.put(employees.get(88),"Payroll");
		departments.put(employees.get(89),"Public Relations");
		departments.put(employees.get(90),"Public Relations");
		departments.put(employees.get(91),"Advertising");
		departments.put(employees.get(92),"Payroll");
		departments.put(employees.get(93),"Public Relations");
		departments.put(employees.get(94),"Tech Support");
		departments.put(employees.get(95),"Sales and Marketing");
		departments.put(employees.get(96),"Public Relations");
		departments.put(employees.get(97),"Finances");
		departments.put(employees.get(98),"Accounting");
		departments.put(employees.get(99),"Customer Relations");
	}

	private void initSalaries() {
		salaries.put(employees.get(0), 500);
		salaries.put(employees.get(1), 600);
		salaries.put(employees.get(2), 650);
		salaries.put(employees.get(3), 700);
		salaries.put(employees.get(4), 900);
		salaries.put(employees.get(5), 5000);
		
		salaries.put(employees.get(10), 500);
		salaries.put(employees.get(11), 500);
		salaries.put(employees.get(12), 500);
		salaries.put(employees.get(13), 700);
		salaries.put(employees.get(14), 700);
		salaries.put(employees.get(15), 700);
		salaries.put(employees.get(16), 800);
		salaries.put(employees.get(17), 800);
		salaries.put(employees.get(18), 800);
		salaries.put(employees.get(19), 400);
		salaries.put(employees.get(20), 400);
		salaries.put(employees.get(21), 400);
		salaries.put(employees.get(22), 900);
		salaries.put(employees.get(23), 600);
		salaries.put(employees.get(24), 400);
		salaries.put(employees.get(25), 400);
		salaries.put(employees.get(26), 800);
		salaries.put(employees.get(27), 800);
		salaries.put(employees.get(28), 900);
		salaries.put(employees.get(29), 700);
		salaries.put(employees.get(30), 500);
		
		
	}

	private void initTasks() {

		tasks.put("SC-3424", employees.get(0));
		tasks.put("SC-4050", employees.get(1));
		tasks.put("SC-2222", employees.get(2));
		tasks.put("SC-1224", employees.get(3));
		tasks.put("SC-6688", employees.get(4));
		tasks.put("SC-5555", null);
	}

	private void initEmployees() {
		employees.add(new Employee(1, "Thomas Reid", "Eernegem", 37));
		employees.add(new Employee(2, "Quentin Mcbride", "Toronto", 39));
		employees.add(new Employee(3, "Carson Fuentes", "Pointe-aux-Trembles", 22));
		employees.add(new Employee(4, "Alexander Reid", "Heide", 24));
		employees.add(new Employee(5, "Bruno Albert", "Fort Simpson", 27));
		employees.add(new Employee(6, "Ignatius Dyer", "Smetlede", 37));
		employees.add(new Employee(7, "Chadwick Rivera", "Chemnitz", 25));
		employees.add(new Employee(8, "Richard Schroeder", "Linton", 34));
		employees.add(new Employee(9, "David Wheeler", "Ragogna", 25));
		employees.add(new Employee(10, "Griffith Tucker", "Oberhausen", 37));
		employees.add(new Employee(11, "Richard Graham", "Laarne", 25));
		employees.add(new Employee(12, "Dante Malone", "Gubkin", 23));
		employees.add(new Employee(13, "Knox Bentley", "Palermo", 32));
		employees.add(new Employee(14, "Nolan Chang", "Sudbury", 34));
		employees.add(new Employee(15, "Ethan Cline", "Bognor Regis", 27));
		employees.add(new Employee(16, "Myles Morrow", "Dendermonde", 25));
		employees.add(new Employee(17, "Phelan Sargent", "Kinross", 27));
		employees.add(new Employee(18, "Melvin Bishop", "Bear", 23));
		employees.add(new Employee(19, "Paul Clements", "Loupoigne", 28));
		employees.add(new Employee(20, "Josiah Adams", "Poole", 34));
		employees.add(new Employee(21, "Harlan Villarreal", "Hugli-Chinsurah", 29));
		employees.add(new Employee(22, "Odysseus Cain", "Pushkino", 23));
		employees.add(new Employee(23, "Josiah Rhodes", "Boninne", 26));
		employees.add(new Employee(24, "Chaney Allen", "Lesve", 30));
		employees.add(new Employee(25, "Ralph Pace", "Vilna", 25));
		employees.add(new Employee(26, "Fuller Hicks", "Hasselt", 23));
		employees.add(new Employee(27, "Derek Tyler", "Sterling Heights", 35));
		employees.add(new Employee(28, "Cairo Jimenez", "Heppenheim", 32));
		employees.add(new Employee(29, "Brandon Hunter", "Sibolga", 25));
		employees.add(new Employee(30, "Stuart Avila", "Coinco", 37));
		employees.add(new Employee(31, "Cyrus Simon", "Waidhofen an der Ybbs", 31));
		employees.add(new Employee(32, "Rahim Bird", "Lloydminster", 36));
		employees.add(new Employee(33, "Wade Wood", "Maunath Bhanjan", 38));
		employees.add(new Employee(34, "Brody Delgado", "Sasaram", 31));
		employees.add(new Employee(35, "George Noel", "Chaumont-Gistoux", 35));
		employees.add(new Employee(36, "Trevor Wong", "Cañete", 22));
		employees.add(new Employee(37, "Dexter Castro", "Hartlepool", 38));
		employees.add(new Employee(38, "Brady Peterson", "Filignano", 39));
		employees.add(new Employee(39, "Alec Knowles", "Berloz", 31));
		employees.add(new Employee(40, "Darius Newman", "Treppo Carnico", 34));
		employees.add(new Employee(41, "Ali Mccray", "Samaniego", 25));
		employees.add(new Employee(42, "Baker Osborn", "Montpelier", 31));
		employees.add(new Employee(43, "Alden Gonzales", "Froidchapelle", 32));
		employees.add(new Employee(44, "Gil Chang", "Giugliano in Campania", 34));
		employees.add(new Employee(45, "Nash Blankenship", "Salisbury", 40));
		employees.add(new Employee(46, "Myles Wagner", "Caledon", 39));
		employees.add(new Employee(47, "Dylan Ellis", "Modena", 31));
		employees.add(new Employee(48, "Beau Curtis", "Balurghat", 31));
		employees.add(new Employee(49, "Alfonso Kline", "Saint-Maur-des-Fossés", 37));
		employees.add(new Employee(50, "Emerson Monroe", "Little Rock", 25));
		employees.add(new Employee(51, "Ferdinand Graves", "Tarcento", 38));
		employees.add(new Employee(52, "Dolan Pickett", "Blagoveshchensk", 35));
		employees.add(new Employee(53, "Bradley Mccullough", "Anghiari", 28));
		employees.add(new Employee(54, "Brody Greer", "Ferrere", 24));
		employees.add(new Employee(55, "Marvin Petersen", "Bendigo", 24));
		employees.add(new Employee(56, "Rogan Ortiz", "Baricella", 24));
		employees.add(new Employee(57, "Wade Mayo", "Zellik", 32));
		employees.add(new Employee(58, "Wyatt Benton", "Petit-Thier", 29));
		employees.add(new Employee(59, "Garrison Horne", "Asso", 33));
		employees.add(new Employee(60, "Hop Mccullough", "Deerlijk", 37));
		employees.add(new Employee(61, "Garrison Maddox", "Castelmezzano", 38));
		employees.add(new Employee(62, "Lance Collier", "San Pedro", 31));
		employees.add(new Employee(63, "Zachary Salas", "Burlington", 40));
		employees.add(new Employee(64, "Nathan Griffin", "Kawerau", 35));
		employees.add(new Employee(65, "Kelly Clarke", "Wilmont", 22));
		employees.add(new Employee(66, "Keith Rice", "Yungay", 30));
		employees.add(new Employee(67, "Gavin Knox", "Boignee", 23));
		employees.add(new Employee(68, "Harper Reilly", "Motueka", 34));
		employees.add(new Employee(69, "Emery Hopper", "Nelson", 24));
		employees.add(new Employee(70, "Jeremy Farrell", "Abolens", 39));
		employees.add(new Employee(71, "Ivan Nash", "Columbus", 38));
		employees.add(new Employee(72, "Walter Michael", "Ferlach", 29));
		employees.add(new Employee(73, "Cody Koch", "Kingussie", 38));
		employees.add(new Employee(74, "Zeph Wall", "Kediri", 30));
		employees.add(new Employee(75, "Denton Hoover", "Macklin", 25));
		employees.add(new Employee(76, "Martin Hudson", "Itanagar", 33));
		employees.add(new Employee(77, "Ezra Kemp", "Ilbono", 31));
		employees.add(new Employee(78, "Jesse Salas", "Edremit", 38));
		employees.add(new Employee(79, "Barrett Eaton", "Lang", 25));
		employees.add(new Employee(80, "Castor Hale", "Ospedaletto d'Alpinolo", 32));
		employees.add(new Employee(81, "Lewis Bennett", "Reinbek", 34));
		employees.add(new Employee(82, "Colton Cabrera", "Saint-Nicolas", 26));
		employees.add(new Employee(83, "Moses Hardy", "Schwäbisch Gmünd", 23));
		employees.add(new Employee(84, "Ahmed Brennan", "Krasnoznamensk", 30));
		employees.add(new Employee(85, "Fritz Pena", "Metz", 37));
		employees.add(new Employee(86, "Philip Burch", "Macduff", 33));
		employees.add(new Employee(87, "Darius Boyle", "Stewart", 29));
		employees.add(new Employee(88, "Kieran Cole", "Ellon", 38));
		employees.add(new Employee(89, "Odysseus Conner", "Montebello sul Sangro", 29));
		employees.add(new Employee(90, "Chandler Coffey", "Morgex", 30));
		employees.add(new Employee(91, "Hop Powell", "Istanbul", 35));
		employees.add(new Employee(92, "Ashton Petersen", "Klabbeek", 26));
		employees.add(new Employee(93, "Oscar Warren", "Okene", 29));
		employees.add(new Employee(94, "Allen Bauer", "Okpoko", 34));
		employees.add(new Employee(95, "Tobias Chandler", "Bourges", 28));
		employees.add(new Employee(96, "Reuben Swanson", "Chiusanico", 38));
		employees.add(new Employee(97, "Xander Sloan", "Alajuelita", 37));
		employees.add(new Employee(98, "Blaze Harding", "Peralillo", 40));
		employees.add(new Employee(99, "Abdul Coffey", "Troitsk", 26));
		employees.add(new Employee(100, "Martin Byers", "Waiblingen", 32));
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public Map<String, Employee> getTasks() {
		return tasks;
	}
	
	public Map<Employee, Integer> getSalaries() {
		return salaries;
	}
	
	public Map<Employee, String> getDepartments() {
		return departments;
	}

	public List<Employee> findEmployees(Predicate<Employee> trait) {
		List<Employee> filterdEmployees = new ArrayList<Employee>();

		for (Employee employee : employees) {

			if (trait.test(employee)) {
				filterdEmployees.add(employee);
			}
		}

		return filterdEmployees;
	}

	public void printEmployees(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public void printTasks(Map<String, Employee> tasks) {
		for (Entry<String, Employee> entry : tasks.entrySet()) {
			System.out.printf("%s ==> %s \n", entry.getKey(),
					entry.getValue() == null ? null : entry.getValue().getName());
		}
	}
	
	public void printSalaries(Map<Employee, Integer> salaries) {
		for (Entry<Employee, Integer> entry : salaries.entrySet()) {
			System.out.printf("%s ==> %s \n", entry.getKey().getName(),
					entry.getValue() == null ? null : entry.getValue());
		}
	}

}
