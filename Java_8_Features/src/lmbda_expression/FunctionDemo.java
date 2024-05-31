package lmbda_expression;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f= (name)->name.length();
		System.out.println(f.apply("Yedukondalu"));
		System.out.println(f.apply("Raju"));
		System.out.println(f.apply("Ramesh"));
		BiFunction<Integer,Integer,Integer> sum= ( a,b)-> a+b;
System.out.println(		sum.apply(12, 30));
	}

}
