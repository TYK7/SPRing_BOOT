package lmbda_expression;

import java.util.ArrayList;
import java.util.function.Predicate;

import Models.Person;

public class PersonsList {
	
	public static void main(String[] args) {
		ArrayList<Person> list=new ArrayList<>();

		
		list.add(new Person("Yedukondalu",23,"HYD"));
		list.add(new Person("Vijay",23,"Chennai"));
		list.add(new Person("Venu",25,"Vijayawada"));
		list.add(new Person("Kushal",5,"HYD"));
		Predicate<Integer> p=(age)-> age>=18;
		for(Person pe:list) {
			if(p.test(pe.age))
			{
				System.out.println(pe);
			}
			
		}
		

	}
	
}
