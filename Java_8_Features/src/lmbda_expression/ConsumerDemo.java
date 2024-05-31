package lmbda_expression;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,34,54,3,24,45,2,5252,422);
		asList.forEach(e-> System.err.println(e));
	}

}
