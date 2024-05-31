package stream_api;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {
		
		//Approach -1
		Stream<Integer>  stream = Stream.of(1,2,3,4,5,6,7,8,9);
		System.out.println(stream.count());
		ArrayList<String> names =new ArrayList<>();
		names.add("Yedukondalu");
		names.add("Venu Gopal");
		names.add("Vijay");
		
		//Approach -2
		Stream<String> stream2 = names.stream();
		
		stream2.sorted().forEach(e-> System.out.println(e));
		
	}

}
