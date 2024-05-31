package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(283,4,3,12,31,31,42,45,535,64,67);
		List<Integer> list = Arrays.asList(12,3,5,6,7,8,6,64,4,63,4677,557,75,35);
		for(Integer i:list)
		{
			if(i>20)
			{
				System.out.println(i);
			}
		}
		stream.filter(i-> i<20).forEach(e->System.out.print(e));
		System.out.println();

		list.stream().filter(i-> i>20).filter(i->i%2==0).forEach(e->System.err.println(e));
		
		List<String> list2 = Arrays.asList("John","Anushka","Robert","Anupama","Smith","Ashok");
		list2.stream().filter(e-> e.startsWith("A")).forEach(e-> System.out.println(e));
		User user= new User("Yedukondalu", 23);
		User user1= new User("Vijay", 23);

		User user2= new User("Venu", 26);

		User user3= new User("Kushal", 6);

		User user4= new User("Rajesh", 22);
		User user5= new User("Gireesh", 24);
		User user6= new User("Dilli", 20);
		List<User> users = Arrays.asList(user,user1,user2,user3,user4,user5,user6);
		users.stream().sorted((u,v)-> u.name.compareToIgnoreCase(v.name)).filter(e-> e.age>20).forEach(e -> System.out.println(e));


	}

}
class User
{
	public String name;
	public int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
