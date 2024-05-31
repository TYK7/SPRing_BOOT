package first;

public class ArrayDemo {
	
	public static void main(String[] args) {
		 
		
		// Variable 
		
		//==> Variable is Used To Store The Data Based On Data Type
		
		// Ex:- int num=90; char c='M', String name="Ramu", boolean=true; double=78.9;
		
		// In Variable We Can Store Single Value
		
		int num=89;
		
		// 1000 variables
		// 1-1000 
		
		// If We Want To Store Multiple Values In Single Variable Then We Go Arrays Concepts
		
		int[] numbers=new int[10];
		numbers[0]=28;
		numbers[1]=92;
		numbers[2]=82;
		numbers[9]=9;
//		System.out.println(numbers[3]);
//		System.out.println(numbers.length);
//		
//		// In Array We Can Store Same Data Type Of Values Only;
//		// We Con't store Mixed Datatype Values In Single Array variable;
//		
//		// We Can Create Array in Two Ways
//		int arr[]=new int[90];
//		for(int i=0;i<numbers.length;i++) {
//			System.out.println(numbers[i]);
//			
//		}//i=0;numbers[i]=numbers[0]
		//i=1; numbers[i]=numbers[1]
		//i=2;numbers[i]=numbers[2];
		//i=8;
		
		int arr1[]= {23,72,928,272,28152,9};
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.println(arr1[i]);
//		}
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]+" ");
		}
		//i=6;6>=0;arr1[6]=9;
		//i=5;arr1[5]=28152;
		//i=4;
		
	}

}
