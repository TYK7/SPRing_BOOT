package stream_api;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> java = Arrays.asList("Core Java","Adv Java","Spring");
		List<String> frontEnd = Arrays.asList("HTML","CSS","JavScript","BS");
		List<List<String>> courses = Arrays.asList(java,frontEnd);
		System.out.println(courses);
		courses.stream().forEach(e-> System.out.println(e));
		courses.stream().flatMap(e->e.stream()).forEach(e->System.out.println(e));
	}

}
