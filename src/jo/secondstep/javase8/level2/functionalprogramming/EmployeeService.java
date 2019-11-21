package jo.secondstep.javase8.level2.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {

	List<Employee> employees = new ArrayList<>();

	public EmployeeService() {

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
}
