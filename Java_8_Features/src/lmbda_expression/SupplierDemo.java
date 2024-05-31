package lmbda_expression;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> ot=()->{
			String otp="";
			for(int i=0;i<5;i++)
			{
			otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());
		System.out.println(ot.get());

		

	}

}
