package Models;

public class Person {
	public String name;
	public int age;
	public String place;
	public Person(String name, int age, String place) {
		this.name = name;
		this.age = age;
		this.place = place;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", place=" + place + "]";
	}
	

}
