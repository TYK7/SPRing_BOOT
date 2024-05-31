package lmbda_expression;

@FunctionalInterface
interface MyInterface
{
	void m1();
}
public class SampleLambda  {
	
	public static void main(String[] args) {
		System.out.println("Demo");
		SampleLambda sl=new SampleLambda();
		MyInterface m=()->{System.out.println("Hello");};
		m.m1();
		
		
	}

	

}
