package practice;

import java.util.Scanner;

public class FibonacciReverse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num=sc.nextInt();
		int firstnum=0;
		int secondnum=1;
		int count=0;
		int fibonacciNumbers[]=new int[num];
		System.out.print("fibonacciseries::" );
		while(count<num) {
			
			if(checkEvengDigint(firstnum)) {
				System.out.print( firstnum+" ");
			}
			
			fibonacciNumbers[count]=firstnum;
			int  nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			count++;
		}
		System.out.println();
		System.out.print("Reversed Fibonocci Numbers Are: ");
		for(int i=fibonacciNumbers.length-1;i>=0;i--)
		{
			System.out.print(fibonacciNumbers[i]+" ");
		}
		
		
	}
	public static  boolean checkEvengDigint(int num)//10
	{
		int count=0;
		boolean isEvenDigit=false;
		if(num==0)
		{
			isEvenDigit=true;
		}
		while(num>0)//10
		{
			int firstDigit=num%10;// 10/10= 0
			if(firstDigit%2==0 )
			{
				isEvenDigit=true;
			}
			num=num/10;// 10/10=1;
			
		}
		return isEvenDigit;
		
	}

}
