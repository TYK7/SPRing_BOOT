package stream_api;

import java.util.Arrays;
import java.util.List;

public class MappingDemo {
	public static void main(String[] args) {
		List<String> countries = Arrays.asList("Ind","USA","ENG","WI","Aus","NZ","SL","SA");
		countries.stream().map(e-> e.toLowerCase()).forEach(e->System.out.println(e));
		System.out.println("==================");
		countries.stream().filter(e-> e.startsWith("S")).map(e-> e.toLowerCase()).forEach(e->System.out.println(e));
		System.out.println("==================");

		countries.stream().mapToInt(e -> e.length()).forEach(e ->System.out.println(e));
		
		List<String> names = Arrays.asList("Akash","Anooj","Raju","Ramesh","Anji","Jhon","Anirudh","Akhil","Anil");
		// Print the Name and Length of name start with A Character
		names.stream().filter(e -> e.startsWith("A")).map(name-> name+"-"+name.length()).forEach(e ->System.out.println(e));
		List<Employee> employees = Arrays.asList(new Employee("Yedukondalu",23,17267.3),new Employee("Bala",25,17007.3),new Employee("Kushal",4,267.3),new Employee("Venu",26,27267.3),
				new Employee("Vijay",22,37267.3),new Employee("Gireesh",24,17267.3));
		// Get EMp Name, Age for whose salary is >10000
		employees.stream().filter(e -> e.salary>10000).map(emp -> emp.name+"-"+emp.age).forEach(e ->System.out.println(e));
		

	}

}
class Employee
{
	String name;
	int age;
	double salary;
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
