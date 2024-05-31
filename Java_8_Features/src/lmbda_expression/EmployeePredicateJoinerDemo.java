package lmbda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import Models.Employee;

public class EmployeePredicateJoinerDemo {
	public static void main(String[] args) {
		Employee emp= new Employee("Yedukondalu", "Hyderabad", "DB", 17000.2);
		Employee emp1= new Employee("Venu", "Hyderabad", "Devolopment", 29000.2);
		Employee emp2= new Employee("Vijay", "Chennai", "DB", 13000.2);
		Employee emp3= new Employee("Rajesh", "Hyderabad", "DB", 11000.2);
		List<Employee>empList=Arrays.asList(emp,emp1,emp2,emp3);
		Predicate<Employee> pre=p -> p.department.equalsIgnoreCase("DB");
		Predicate<Employee> pre1=p -> p.location.equalsIgnoreCase("Hyderabad");
		Predicate<Employee>p1=pre.and(pre1);
		empList.forEach(e-> {if(p1.test(e)) {
			System.out.println(e);
		}
			
		});
//		System.out.println(empList);

	}

}
