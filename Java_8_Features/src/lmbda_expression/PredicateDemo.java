package lmbda_expression;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<String> p= name -> name.length()>5;
		Predicate<String> p1= name -> name.startsWith("V");
		boolean test = p.test("ku");
		System.out.println(p.test("Yedukondalu"));
		System.out.println(test);
		
	      String names[]= {"Rajesh","Kushal","Venu","VIjay","Seven","Vinay","Anil","Ramu"};
	     for( String name:names)
	     {
	    	 if(p1.test(name))
	    	 {
	    		 System.out.println(name);
	    	 }
	     }
	}

}
