package first;

import java.util.Scanner;

public class FibonacciCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second Number");
		int num2 = sc.nextInt();

		int a = 0;
		int b = 1;
		int c = 0;
		int count = 0;
		for (int i = 0; i <= num2; i++) {
			c = a + b;
			a = b;
			b = c;
			if (c > num1 && c < num2) {
				count++;
			}
		}
		System.out.println("Between The  " + num1 + " and " + num2 + "  Fibinocci Numbers Are: " + count);
		int sum = 0;
		int count1 = count;
		if (count1 % 2 == 0) {
			while (count1 != 0) {
				int lastDigit = count1 % 10;
				sum += lastDigit;
				count1 /= 10;
			}
			System.out.println("The Count Is Even So-The Sum Of Digits Of Count is: " + sum);
		} else {
			int higestPrimeDigit = 0;
			while (count != 0) {

				int lastDigit = count % 10;
				int primeCounting = 0;
				for (int i = 1; i <= lastDigit; i++) {
					if (lastDigit % i == 0) {
						primeCounting++;
					}
				}
				if (primeCounting == 2 && lastDigit > higestPrimeDigit) {
					higestPrimeDigit = lastDigit;
				}

				count /= 10;

			}
			if (higestPrimeDigit != 0) {
				System.out.println(
						"The Count Is Odd So- The Largest Prime Digit In Count Number Is:  " + higestPrimeDigit);
			} else {
				System.err.println("The Count Is Odd But ,The Count Number Does't Contain The Prime Digits");
			}
		}

	}

}
