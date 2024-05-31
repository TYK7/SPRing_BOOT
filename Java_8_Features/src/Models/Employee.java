package Models;

public class Employee {
	public String name;
	public String location;
	public String department;
	public double salary;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", location=" + location + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	public Employee(String name, String location, String department, double salary) {
		this.name = name;
		this.location = location;
		this.department = department;
		this.salary = salary;
	}
	

}
