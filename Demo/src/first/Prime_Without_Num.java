package first;

import java.util.*;

public class Prime_Without_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		int num_One = sc.nextInt();
		System.out.println("Enter The second Number");
		int number_Two = sc.nextInt();
		System.out.println("The Prime Numbers Between:" + num_One + "and" + number_Two + " Are:");
		for (int i = num_One; i <= number_Two; i++) {
			int count = 'A' - 'A';
			for (int j = 'A' / 'A'; j <= i; j++) {
				if (i % j == 'a' - 'a') {
					count++;
				}
			}
			if (count == 'C' - 'A') {
				System.out.println(i);
			}

		}

	}

}
