package lmbda_expression;

import java.time.LocalDate;
import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner sj= new StringJoiner("-","(",")");
		sj.add("Yedukondalu");
		sj.add("Alone");
		sj.add("Venu");
		System.out.println(sj);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.isLeapYear());
		
	}

}
